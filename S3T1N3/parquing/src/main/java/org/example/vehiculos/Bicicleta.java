package org.example.vehiculos;

public class Bicicleta implements VehiculoAbstr {

    private String name;

    public Bicicleta(String name) {
        this.name = name;
    }

    public void arrancar() {
        System.out.println(name + ": La bici 'arranca'...");
    }

    public void accelerar() {
        System.out.println(name + ": Bici: quack quack quack .. accelerando");
    }

    public void frenar() {
        System.out.println(name + ": Uiiiiiii.... bici frenando");
    }

}
