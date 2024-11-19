package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1- Consultar vagas disponíveis");
            System.out.println("2- Registrar entrada de carro");
            System.out.println("3- Registrar saída de carro");
            System.out.println("4- Reservar vaga VIP");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    estacionamento.consultarVagas();
                    break;
                case 2:
                    System.out.print("Digite o tipo de vaga (Regular, VIP, Elétrica, Deficiente): ");
                    String tipoEntrada = scanner.next();
                    estacionamento.registrarEntrada(tipoEntrada);
                    break;
                case 3:
                    System.out.print("Digite o tipo de vaga (Regular, VIP, Elétrica, Deficiente): ");
                    String tipoSaida = scanner.next();
                    System.out.print("Digite as horas de permanência: ");
                    double horas = scanner.nextDouble();
                    estacionamento.registrarSaida(tipoSaida, horas);
                    break;
                case 4:
                    estacionamento.reservarVagaVIP();
                    break;
                case 5:
                    System.out.println("Encerrando sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
