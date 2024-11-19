package org.example;

public class VagaRegular extends Vaga {

    public VagaRegular() {
        super("Regular");
    }

    @Override
    public double calcularTarifa(double horas) {
        return horas * 10.0;
    }
}

