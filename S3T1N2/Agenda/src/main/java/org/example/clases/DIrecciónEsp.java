package org.example.clases;

import org.example.interfaces.IAdress;

public class DIrecciónEsp implements IAdress {
    private String country;
    private String city;
    private String address;
    private String name;

    public DIrecciónEsp(String city, String address, String name) {
        this.city = city;
        this.address = address;
        this.name = name;
        this.country="España";
    }

    public DIrecciónEsp() {

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
        System.out.println(address +" "+name+" Spain");
    }

    @Override
    public String toString() {
        return "DIrecciónEsp{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
