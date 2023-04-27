/* Elabore um programa Java que para cada produto informado (nome, preço e quantidade), 
escreva o nome do produto comprado e o valor total a ser pago, 
considerando que são oferecidos descontos pelo número de unidades compradas, segundo a tabela abaixo:
a. até 10 unidades: valor total
b. de 11 a 20 unidades: 10% de desconto
c. de 21 a 50 unidades: 20% de desconto
d. acima de 50 unidades: 25% de desconto*/

package ativiades;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		String produto;
		float preco;
		int quantidade;
		float desconto;
		float total= 0;
		
		System.out.println("informe o produto: ");
		produto = sn.next();
		
		System.out.println("informe o preco: ");
		preco =sn.nextFloat();
	
		
		System.out.println("informe a quatidade de produtos: ");
		quantidade = sn.nextInt();
		
		if(quantidade <= 10) {
			total = quantidade * preco;
		}
		
		else if(quantidade > 10 && quantidade <=20) {
			desconto = (float) ((quantidade * preco)* 0.10);
			total = quantidade * preco - desconto;
		}
		
		else if(quantidade > 20 && quantidade <=50) {
			desconto = (float) ((quantidade * preco)* 0.20);
			total = quantidade * preco - desconto;
		}
		
		else if(quantidade > 50) {
			desconto = (float) ((quantidade * preco)* 0.25);
			total = quantidade * preco - desconto;
		}

		System.out.println("Produto: " + produto + " \nValor a ser pago: R$ " + total);
		sn.close();
	}

}
