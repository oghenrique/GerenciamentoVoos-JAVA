package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {

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
            System.out.println("4 - Companhias Aereas");
            System.out.print("\nOpção: ");

            int userOption = teclado.nextInt();
            teclado.nextLine();

            switch (userOption) {
                case 0:
                    System.out.println("Volte sempre! =D");
                    sair = false;
                    break;
                case 1:


            }
        }
    }
}
