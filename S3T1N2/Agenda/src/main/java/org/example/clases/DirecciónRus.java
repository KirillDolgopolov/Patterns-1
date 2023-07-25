package org.example.clases;

import org.example.interfaces.IAdress;

public class DirecciónRus implements IAdress {


    private String country;
    private String city;
    private String address;
    private String name;


    public DirecciónRus() {
        this.country = "Russia";
        this.city = "";
        this.address = "";
        this.name = "";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void giveMeAddress() {
        System.out.println(address + " "+city+" " + name + " Russia");
    }

    @Override
    public String toString() {
        return "DIrecciónRus{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}