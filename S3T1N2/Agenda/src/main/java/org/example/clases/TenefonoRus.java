package org.example.clases;

import org.example.interfaces.ITelefono;

public class TenefonoRus implements ITelefono {
    private String country;
    private String prefix;
    private Integer number;
    private String name;

    public TenefonoRus() {
        this.country = "Russia";
        this.prefix = "+7";
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
    public void call() {
        System.out.println("We are calling to " + this.country + " " + this.prefix + " " + this.number + " " + this.name);
    }

    @Override
    public String toString() {
        return "TenefonoRus{" +
                "country='" + country + '\'' +
                ", prefix='" + prefix + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
