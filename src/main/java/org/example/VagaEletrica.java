package org.example;

public class VagaEletrica extends Vaga {

    public VagaEletrica() {
        super("Elétrica");
    }

    @Override
    public double calcularTarifa(double horas) {
        return horas * 12.0;
    }
}
