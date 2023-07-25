package org.example;

import org.example.vehiculos.Avión;
import org.example.vehiculos.Barco;
import org.example.vehiculos.Bicicleta;
import org.example.vehiculos.Coche;

public class Main {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();

        Coche coche1 = new Coche("Audi");
        Bicicleta bici1 = new Bicicleta("Aguila china");
        Barco barco1 = new Barco("Horizont");
        Avión avion1 = new Avión("Cessna 210");

        ArrancarImpl ar1 = new ArrancarImpl(coche1);
        ArrancarImpl ar2 = new ArrancarImpl(bici1);
        ArrancarImpl ar3 = new ArrancarImpl(barco1);
        ArrancarImpl ar4 = new ArrancarImpl(avion1);

        AccelerarImpl acc1 = new AccelerarImpl(coche1);
        AccelerarImpl acc2 = new AccelerarImpl(bici1);
        AccelerarImpl acc3 = new AccelerarImpl(barco1);
        AccelerarImpl acc4 = new AccelerarImpl(avion1);

        FrenarImpl fr1 = new FrenarImpl(coche1);
        FrenarImpl fr2 = new FrenarImpl(bici1);
        FrenarImpl fr3 = new FrenarImpl(barco1);
        FrenarImpl fr4 = new FrenarImpl(avion1);

        invoker.getOperation(ar1);
        invoker.getOperation(ar2);
        invoker.getOperation(ar3);
        invoker.getOperation(ar4);

        invoker.getOperation(acc1);
        invoker.getOperation(acc2);
        invoker.getOperation(acc3);
        invoker.getOperation(acc4);

        invoker.getOperation(fr1);
        invoker.getOperation(fr2);
        invoker.getOperation(fr3);
        invoker.getOperation(fr4);


        invoker.doOperation();


    }
}