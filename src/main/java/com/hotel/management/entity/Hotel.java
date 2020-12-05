package com.hotel.management.entity;

import java.util.List;

public class Hotel {
    private String name;
    private String regularCustomerRates;
    private String newCustomerRates;
    private String newCustomerWeekendRates;
    private String regularCustomerWeekendRates;
    private List<String> regularCustomers;

    public Hotel() {
    }

    public Hotel(String name, String regularCustomerRates, String newCustomerRates, String newCustomerWeekendRates, String regularCustomerWeekendRates, List<String> regularCustomers) {
        this.name = name;
        this.regularCustomerRates = regularCustomerRates;
        this.newCustomerRates = newCustomerRates;
        this.newCustomerWeekendRates = newCustomerWeekendRates;
        this.regularCustomerWeekendRates = regularCustomerWeekendRates;
        this.regularCustomers = regularCustomers;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", regularCustomerRates='" + regularCustomerRates + '\'' +
                ", newCustomerRates='" + newCustomerRates + '\'' +
                ", regularCustomers=" + regularCustomers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegularCustomerRates() {
        return regularCustomerRates;
    }

    public void setRegularCustomerRates(String regularCustomerRates) {
        this.regularCustomerRates = regularCustomerRates;
    }

    public String getNewCustomerRates() {
        return newCustomerRates;
    }

    public void setNewCustomerRates(String newCustomerRates) {
        this.newCustomerRates = newCustomerRates;
    }

    public List<String> getRegularCustomers() {
        return regularCustomers;
    }

    public void setRegularCustomers(List<String> regularCustomers) {
        this.regularCustomers = regularCustomers;
    }
}
