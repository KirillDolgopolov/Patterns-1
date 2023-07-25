package org.example;

import org.example.vehiculos.VehiculoAbstr;

public class FrenarImpl implements IOperación {

    private VehiculoAbstr vehiculo;

    public FrenarImpl(VehiculoAbstr vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        this.vehiculo.frenar();

    }
}
