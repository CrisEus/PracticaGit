/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author Eustral
 */
public class CalFibonacci {
//añado un comentario desde github
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        Scanner miScan = new Scanner(System.in);
        String sSalir;
        
        int iValor = 0;
        String sResultado = "";
        String sAux;
//Nodo1

        do {
            System.out.println("Pulsa intro comenzar o S, s para salir..");
            sSalir = miScan.nextLine();
            System.out.println("¿Cuantos números de la serie desea demostrar?");
            sAux = miScan.nextLine();
            iValor = Integer.parseInt(sAux);
            switch (iValor) {
                case 3:
                    sResultado = "1";
                    break;
                case 2:
                    sResultado = "0" + sResultado;
                    break;
                case 1:
                    sResultado = "0" + sResultado;
                    break;
            }
        } while (!(sSalir.equals("S") || sSalir.equals("S")));
        
        sSalir = miScan.nextLine();
    }
}
