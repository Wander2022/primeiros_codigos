package Primeiroscodigos;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite o primeiro valor: ");
	    a = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.print("soma: " + soma );
		System.out.print("\nsubtracao: " + subtracao );
		System.out.print("\nmultiplicaçâo: " + multiplicacao );
		System.out.print("\ndivisão: " + divisao );
	}
	
	private static int soma (int a, int b) {
	
return a + b;
		
	}

	private static double divisao(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	private static int multiplicacao(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int subtracao(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
		
	}

	
}
