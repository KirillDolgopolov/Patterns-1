package org.example.interfaces;

import org.example.clases.TelefonoEsp;
import org.example.clases.TenefonoRus;

public class Phone implements FabricaAbstracta {


    public ITelefono getTelefonoObject(String pais) {

        if (pais.equalsIgnoreCase("España")) {
            return new TelefonoEsp();
        } else if (pais.equalsIgnoreCase("Russia")) {
            return new TenefonoRus();
        } else {
            System.out.println("No hay esta página en tu agenda");
        }
        return null;

    }

    @Override
    public IAdress getAdressObject(String adress) {
        return null;
    }
}