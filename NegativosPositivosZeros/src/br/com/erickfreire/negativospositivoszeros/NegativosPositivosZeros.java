package br.com.erickfreire.negativospositivoszeros;

import java.util.Scanner;

public class NegativosPositivosZeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;
		int positivo = 0;
		int negativo = 0;
		int zero = 0;
		
		System.out.println("Programa que exibe quantos valores são negativos, positivos e zero!");
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		
		if(numero1 == 0)
			zero = zero + 1;
		
		if(numero1 > 0)
			positivo = positivo + 1;
		
		if(numero1 < 0)
			negativo = negativo + 1;
		
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero2 == 0)
			zero = zero + 1;
		
		if(numero2 > 0)
			positivo = positivo + 1;
		
		if(numero2 < 0)
			negativo = negativo + 1;
		
		System.out.print("Digite o terceiro valor: ");
		numero3 = entrada.nextInt();
		
		if(numero3 == 0)
			zero = zero + 1;
		
		if(numero3 > 0)
			positivo = positivo + 1;
		
		if(numero3 < 0)
			negativo = negativo + 1;
		
		
		System.out.print("Digite o quarto valor: ");
		numero4 = entrada.nextInt();
		
		if(numero4 == 0)
			zero = zero + 1;
		
		if(numero4 > 0)
			positivo = positivo + 1;
		
		if(numero4 < 0)
			negativo = negativo + 1;
		
		System.out.print("Digite o quinto valor: ");
		numero5 = entrada.nextInt();
		
		if(numero5 == 0)
			zero = zero + 1;
		
		if(numero5 > 0)
			positivo = positivo + 1;
		
		if(numero5 < 0)
			negativo = negativo + 1;
		
		System.out.printf("%nPositivos: %d%nNegativos: %d%nZeros: %d%n", positivo, negativo, zero);
		
		
	}

}
