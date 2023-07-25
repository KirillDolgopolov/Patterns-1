package org.example.vehiculos;

public class Avión implements VehiculoAbstr {

    private String name;

    public Avión(String name) {
        this.name = name;
    }

    public void arrancar() {
        System.out.println(name + ": El avion arranca...");
    }

    public void accelerar() {
        System.out.println(name + ": Avión: Vrummmmm... accelerando");
    }

    public void frenar() {
        System.out.println(name + ": Zzzzz.... avión frenando");
    }

}
