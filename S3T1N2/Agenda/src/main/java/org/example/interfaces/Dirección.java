package org.example.interfaces;

import org.example.clases.DIrecciónEsp;
import org.example.clases.DirecciónRus;

public class Dirección implements FabricaAbstracta{

    public IAdress getAdressObject(String pais) {
        if (pais.equalsIgnoreCase("España")) {
            return new DIrecciónEsp();
        } else if (pais.equalsIgnoreCase("Russia")) {
            return new DirecciónRus();
        } else {
            System.out.println("Este país no existe en mi programma");
            return null;
        }
    }

    @Override
    public ITelefono getTelefonoObject(String tel) {
        return null;
    }
}
