package org.example;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IOperación> operaciónes = new ArrayList<>();

    public void getOperation(IOperación operación) {
        operaciónes.add(operación);
    }

    public void doOperation() {
        this.operaciónes.forEach(x -> x.execute());
        this.operaciónes.clear();
        System.out.println("List of operations finished");
    }

}
