package org.example.clases;

import org.example.interfaces.ITelefono;

public class TelefonoEsp implements ITelefono {
    private String country;
    private String prefix;
    private Integer number;
    private String name;


    public TelefonoEsp() {
        this.country = "España";
        this.prefix = "+34";
        this.number = 0;
        this.name = "";
    }


    public Integer getNumber() {
        return number;
    }


    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "TelefonoEsp{" +
                "country='" + country + '\'' +
                ", prefix='" + prefix + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void call() {
        System.out.println("We are calling to " + this.country + " " + this.prefix + " " + this.number + " " + this.name);
    }
}
