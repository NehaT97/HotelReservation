package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HotelReservationService {
    Hotel hotel = new Hotel();
    List<Hotel> hotellist = new ArrayList<>();
    Scanner scanner;


    public int findDateDifference(String startDate, String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse(startDate);
        Date secondDate = sdf.parse(endDate);

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        int days = (int)TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return days;

    }

    public float findRate(int numDays){
        return hotel.getRate()*numDays;
    }


}
