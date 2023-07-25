package org.example;

import org.example.vehiculos.VehiculoAbstr;

public class AccelerarImpl implements IOperación {
    private VehiculoAbstr vehiculo;

    public AccelerarImpl(VehiculoAbstr vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        this.vehiculo.accelerar();
    }
}
