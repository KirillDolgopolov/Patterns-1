package org.example.vehiculos;

public class Coche implements VehiculoAbstr {

    private String name;

    public Coche(String name) {
        this.name = name;
    }

    public void arrancar() {
        System.out.println(name + ": El coche arranca...");
    }

    public void accelerar() {
        System.out.println(name + ": Coche: Brummmmm... accelerando");
    }

    public void frenar() {
        System.out.println(name + ": Pshhhhh.... coche frenando");
    }


}
