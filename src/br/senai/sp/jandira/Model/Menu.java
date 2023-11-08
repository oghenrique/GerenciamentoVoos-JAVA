package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Voo> voos = new ArrayList<>();

    public void Menu() {

        voos.add(new VooEmirates("BB-8", "Congonhas", "Qatar", "12-09-2023", "12h47", 300));
        voos.add(new VooDelta("R2D2", "Guarulhos", "Paris", "17-11-2023", "08h00", 250));
        voos.add(new VooAzul("C3PO", "São Paulo", "Natal", "23-10-2023", "15h00", 200));

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

                    break;
                case 3:
                   
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
            voo.getHoraPartida();
            System.out.println();
        }
    }

    private void listarCompanhiasAereas() {
        System.out.println("Lista de Companhias Aéreas: ");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println();
        }
    }
}