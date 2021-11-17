package projetodozekinha.teste;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
	
		soma = a + b ;
		
		System.out.println("digite o valor da primeira nota:");
		System.out.println("digite o valor da segunda nota:");
		
		if (soma >=6) {
			System.out.println("Aluno Aprovado!!!");
		}
		else {
			System.out.println("aluno reprovado!!!");
		}
		
	}
	
}


