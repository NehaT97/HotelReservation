package com.hotel.management.entity;

import java.util.List;

public class Hotel {
    private String name;
    private String regularCustomerRates;
    private String rewardsCustomerRates;
    private String rewardsCustomerWeekendRates;
    private String regularCustomerWeekendRates;
    private List<String> regularCustomers;

    public Hotel() {
    }

    public Hotel(String name, String regularCustomerRates, String rewardsCustomerRates, String rewardsCustomerWeekendRates, String regularCustomerWeekendRates, List<String> regularCustomers) {
        this.name = name;
        this.regularCustomerRates = regularCustomerRates;
        this.rewardsCustomerRates = rewardsCustomerRates;
        this.rewardsCustomerWeekendRates = rewardsCustomerWeekendRates;
        this.regularCustomerWeekendRates = regularCustomerWeekendRates;
        this.regularCustomers = regularCustomers;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", regularCustomerRates='" + regularCustomerRates + '\'' +
                ", rewardsCustomerRates='" + rewardsCustomerRates + '\'' +
                ", rewardsCustomerWeekendRates='" + rewardsCustomerWeekendRates + '\'' +
                ", regularCustomerWeekendRates='" + regularCustomerWeekendRates + '\'' +
                ", regularCustomers=" + regularCustomers;
    }

    public String getrewardsCustomerWeekendRates() {
        return rewardsCustomerWeekendRates;
    }

    public void setrewardsCustomerWeekendRates(String rewardsCustomerWeekendRates) {
        this.rewardsCustomerWeekendRates = rewardsCustomerWeekendRates;
    }

    public String getRegularCustomerWeekendRates() {
        return regularCustomerWeekendRates;
    }

    public void setRegularCustomerWeekendRates(String regularCustomerWeekendRates) {
        this.regularCustomerWeekendRates = regularCustomerWeekendRates;
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

    public String getrewardsCustomerRates() {
        return rewardsCustomerRates;
    }

    public void setrewardsCustomerRates(String rewardsCustomerRates) {
        this.rewardsCustomerRates = rewardsCustomerRates;
    }

    public List<String> getRegularCustomers() {
        return regularCustomers;
    }

    public void setRegularCustomers(List<String> regularCustomers) {
        this.regularCustomers = regularCustomers;
    }
}
