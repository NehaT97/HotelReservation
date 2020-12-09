package com.hotel.management.service;

import com.hotel.management.entity.Hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HotelManagementService {

    private List<Hotel> hotelsData;

    public HotelManagementService() {
        hotelsData = new ArrayList<>();
    }

    public Hotel addHotel(String hotelName, String rating, String regularCustomerRates, String rewardsCustomerRates, String regularCustomerWeekendRates,
                          String rewardsCustomerWeekendRates, String ...regularCustomers){
        Hotel hotel = new Hotel(hotelName, rating, regularCustomerRates, rewardsCustomerRates,
                rewardsCustomerWeekendRates,regularCustomerWeekendRates, Arrays.asList(regularCustomers));
        hotelsData.add(hotel);
        return hotel;
    }

    public Map.Entry<String, Double> findCheapestHotel(String fromDate, String toDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar calendar = Calendar.getInstance();
        Date from = simpleDateFormat.parse(fromDate);
        Date to = simpleDateFormat.parse(toDate);


        long differenceInDate = to.getTime() - from.getTime();
        long differenceInDays = (differenceInDate / (1000 * 60 * 60 * 24)) % 365;

        Map<String, Double> hotelRatesMap = new HashMap<>();
        hotelsData.stream().forEach(hotel -> {
            Date tempDate = from;
            Double totalRate = 0.0;
            for (int i=1; i <=differenceInDays; i++) {
                calendar.setTime(tempDate);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                if (dayOfWeek ==  7 || dayOfWeek == 1) {
                    totalRate = totalRate + (Double.valueOf(hotel.getRegularCustomerWeekendRates()));
                    tempDate = new Date(tempDate.getTime() + (1000 * 60 * 60 * 24));
                    continue;
                }
                totalRate = totalRate + (Double.valueOf(hotel.getRegularCustomerRates()));
                tempDate = new Date(tempDate.getTime() + (1000 * 60 * 60 * 24));
            }
            hotelRatesMap.put(hotel.getName(), totalRate);
        });
        return hotelRatesMap.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get();
    }


}
