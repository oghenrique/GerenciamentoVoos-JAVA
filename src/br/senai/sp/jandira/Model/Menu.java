package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Voo> voos = new ArrayList<>();

    public void Menu() {
        Scanner teclado = new Scanner(System.in);
        boolean sair = true;

        while (sair) {
            System.out.println("---------- Bem Vindo ----------");
            System.out.println("\n==> Menu:\n");
            System.out.println("0 - Sair");
            System.out.println("1 - Horários Voos");
            System.out.println("2 - Destinos");
            System.out.println("3 - Data de partidas");
            System.out.println("4 - Companhias Aéreas");
            System.out.print("\nOpção: ");

            int userOption = teclado.nextInt();
            teclado.nextLine();

            switch (userOption) {
                case 0:
                    System.out.println("Volte sempre! =D");
                    sair = false;
                    break;
                case 1:
                    listarHorariosVoos();
                    break;
                case 2:
                    // Implemente a listagem de destinos aqui
                    break;
                case 3:
                    // Implemente a listagem de datas de partida aqui
                    break;
                case 4:
                    listarCompanhiasAereas();
                    break;
            }
        }
    }

    private void listarHorariosVoos() {
        System.out.println("Lista de Horários de Voos:");
        for (Voo voo : voos) {
            voo.exibirDetalhes();
            System.out.println();
        }
    }

    private void listarCompanhiasAereas() {
        System.out.println("Lista de Companhias Aéreas: ");
        for (Voo voo : voos) {
            System.out.println("Número do Voo: " + voo.getNumeroVoo());
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println();
        }
    }
}