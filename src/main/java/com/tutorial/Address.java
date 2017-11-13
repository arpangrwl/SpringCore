package com.tutorial;

/**
 * Created by Arpan on 11/12/17.
 */
public class Address {

    String Street;
    int houseNo;

    public Address(String street, int houseNo) {
        Street = street;
        this.houseNo = houseNo;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "Street='" + Street + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
}
