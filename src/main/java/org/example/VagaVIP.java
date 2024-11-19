package org.example;

public class VagaVIP extends Vaga {

    public VagaVIP() {
        super("VIP");
    }

    @Override
    public double calcularTarifa(double horas) {
        return horas * 5.0;
    }
}
