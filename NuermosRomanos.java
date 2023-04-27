/*Elabore um programa Java que leia um número decimal (até 3 dígitos) e escreva o seu equivalente em numeração romana.
Utilize métodos para obter cada dígito do número decimal e para a transformação de numeração decimal para romana 
(Dica1: 1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1.000 = M;
Dica2: utilize um vetor guardando a tradução para cada um dos dígitos).*/
package ativiades;

import java.util.Scanner;

public class NuermosRomanos {
	public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while (true) {
        	System.out.println("digite um numero entre 1 e 1000");
            int numero = teclado.nextInt();
            
            if (numero == 0)System.out.printf("o numero tem que ser maior que ");
            
            if(numero >1000) { 
            	System.out.println("numero maior que mil");
            	break;
            }
            
            System.out.printf("%-3d ", numero);
            int i = 0;
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    System.out.print(vaRom[i]);
                    numero -= vaNum[i];
                } else {
                    i++;
                }
            }
            System.out.println();
            teclado.close();
        }
	}
}