package org.example.interfaces;

public class FabricaAgenda {

    public static FabricaAbstracta getFabrica(String typeFabrica) {

        if (typeFabrica.equalsIgnoreCase("phone")) {
            return new Phone();
        } else if (typeFabrica.equalsIgnoreCase("address")) {
            return new Dirección();
        } else return null;

    }

}
