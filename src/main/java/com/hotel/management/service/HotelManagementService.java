package com.hotel.management.service;

import com.hotel.management.entity.Hotel;

import java.util.*;

public class HotelManagementService {

    private List<Hotel> hotelsData;

    public HotelManagementService() {
        hotelsData = new ArrayList<>();
    }

    public Hotel addHotel(String hotelName, String regularCustomerRates, String newCustomerRates, String regularCustomerWeekendRates,
                          String newCustomerWeekendRates, String ...regularCustomers){
        Hotel hotel = new Hotel(hotelName, regularCustomerRates, newCustomerRates,
                newCustomerWeekendRates,regularCustomerWeekendRates, Arrays.asList(regularCustomers));
        hotelsData.add(hotel);
        return hotel;
    }
}
