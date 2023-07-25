package org.example;

import org.example.vehiculos.VehiculoAbstr;

public class ArrancarImpl implements IOperación {

    private VehiculoAbstr vehiculo;

    public ArrancarImpl(VehiculoAbstr vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void execute() {
        this.vehiculo.arrancar();
    }
}
