package Primeiroscodigos;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {
		
		int num1, num2, resultado;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Digite um número: ");
		num1 = scanner.nextInt();
		
		System.out.println(" Digite um número: ");
		num2 = scanner.nextInt();
		
		resultado = num1 - num2;
		System.out.println(" A multiplicação dos dois numeros é: " + resultado);


	}

}
