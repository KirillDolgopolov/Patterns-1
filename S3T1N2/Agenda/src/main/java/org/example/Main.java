package org.example;

import org.example.interfaces.ITelefono;
import org.example.interfaces.FabricaAbstracta;
import org.example.interfaces.FabricaAgenda;
import org.example.interfaces.IAdress;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Fabrika!");
        System.out.println();

        FabricaAbstracta faPhone = FabricaAgenda.getFabrica("phone");
        FabricaAbstracta faAddress = FabricaAgenda.getFabrica("address");

        ITelefono phoneInterfaceObject1 = faPhone.getTelefonoObject("España");
        IAdress addressInterfaceObject1 = faAddress.getAdressObject("Russia");

        phoneInterfaceObject1.setName("Juan Carles");
        phoneInterfaceObject1.setNumber(655257656);
        phoneInterfaceObject1.call();

        addressInterfaceObject1.setAddress("Calle de Libertad 22");
        addressInterfaceObject1.setCity("Vladivostok");
        addressInterfaceObject1.setName("Pedro Pepino");

        addressInterfaceObject1.giveMeAddress();


    }

}

