package org.example;

public abstract class Vaga {
    protected boolean ocupada;
    protected String tipo;

    public Vaga(String tipo) {
        this.tipo = tipo;
        this.ocupada = false;
    }

    public abstract double calcularTarifa(double horas);

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getTipo() {
        return tipo;
    }
}
