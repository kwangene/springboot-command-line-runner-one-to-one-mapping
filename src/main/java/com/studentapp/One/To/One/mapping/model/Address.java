package com.studentapp.One.To.One.mapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private String city;
    private String state;

    public Address() {
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
