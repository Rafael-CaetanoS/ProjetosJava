/*Elabore um programa Java que calcule a média de um aluno de acordo com 
o critério definido neste curso informe o status do aluno de acordo com a tabela a seguir:
Nota acima de 6 à “Aprovado”
Nota entre 4 e 6 à Conceito “Verificação Suplementar”
Nota abaixo de 4 à Conceito “Reprovado”
*/

package ativiades;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		float [] notas = new float[2];
		float calc = 0;
		float media;
		int j= 1;
		
	Scanner sn = new Scanner(System.in);
	
		for(int i =0; i < notas.length; i++) {
			System.out.println("informe sua nota A" + j);
			notas[i] = sn.nextFloat();
			calc += notas[i];
			j +=1;
		}
		
		media = calc / notas.length;
		
		if( media >= 6) System.out.println("media:" + media + " Aprovado");
		else if (media >= 4) System.out.println("media:" + media + " Verificaçao suplementar");
		else System.out.println("media:" +media + " reprovado");
		
		sn.close();
	}
}	
