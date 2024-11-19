package org.example;

public class VagaDeficiente extends Vaga {

    public VagaDeficiente() {
        super("Deficiente");
    }

    @Override
    public double calcularTarifa(double horas) {
        return 0; // Gratuita
    }
}
