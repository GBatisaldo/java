package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1 ) {
                    alcool = alcool + 1;
            }
            else if (tipo == 2) {
                    gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                    diesel = diesel + 1;
            }
            else if (tipo > 4 | tipo < 0){
                System.out.println("Selecione um numero de 1 a 4");
            }

            tipo = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + + diesel);

        sc.close();
    }
}
