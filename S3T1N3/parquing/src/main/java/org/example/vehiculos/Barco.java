package org.example.vehiculos;

public class Barco implements VehiculoAbstr {
    private String name;

    public Barco(String name) {
        this.name = name;
    }

    public void arrancar() {
        System.out.println(name + ": El barco arranca...");
    }

    public void accelerar() {
        System.out.println(name + ": Barco: Brummmmm... accelerando");
    }

    public void frenar() {
        System.out.println(name + ": Cluc cluc cluc...... barco frenando");
    }

}
