package com.mycompany.invoise.entity;

public class Invoice {
    private String number;
    private String customerName;

    public Invoice() {
    }

    public Invoice(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getNumber() {
        return number;
    }

    public String getCustomerName() {
        return customerName;
    }
}
