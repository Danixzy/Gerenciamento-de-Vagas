package org.example;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;

    public Estacionamento() {
        vagas = new ArrayList<>();
        // Inicializando vagas (exemplo)
        for (int i = 0; i < 10; i++) {
            vagas.add(new VagaRegular());
        }
        for (int i = 0; i < 5; i++) {
            vagas.add(new VagaVIP());
        }
        for (int i = 0; i < 3; i++) {
            vagas.add(new VagaEletrica());
        }
        for (int i = 0; i < 2; i++) {
            vagas.add(new VagaDeficiente());
        }
    }

    public void consultarVagas() {
        for (Vaga vaga : vagas) {
            System.out.println("Tipo: " + vaga.getTipo() + " - Ocupada: " + (vaga.isOcupada() ? "Sim" : "Não"));
        }
    }

    public void registrarEntrada(String tipoVaga) {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada() && vaga.getTipo().equalsIgnoreCase(tipoVaga)) {
                vaga.setOcupada(true);
                System.out.println("Entrada registrada. Vaga do tipo " + tipoVaga + " ocupada.");
                return;
            }
        }
        System.out.println("Nenhuma vaga disponível para o tipo: " + tipoVaga);
    }

    public void registrarSaida(String tipoVaga, double horas) {
        for (Vaga vaga : vagas) {
            if (vaga.isOcupada() && vaga.getTipo().equalsIgnoreCase(tipoVaga)) {
                double tarifa = vaga.calcularTarifa(horas);
                vaga.setOcupada(false);
                System.out.println("Saída registrada. Total a pagar: R$ " + tarifa);
                return;
            }
        }
        System.out.println("Nenhuma vaga ocupada para o tipo: " + tipoVaga);
    }

    public void reservarVagaVIP() {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada() && vaga instanceof VagaVIP) {
                vaga.setOcupada(true);
                System.out.println("Vaga VIP reservada com sucesso.");
                return;
            }
        }
        System.out.println("Nenhuma vaga VIP disponível para reserva.");
    }
}
