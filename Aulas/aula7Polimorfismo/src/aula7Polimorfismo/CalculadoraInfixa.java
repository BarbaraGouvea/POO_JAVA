package aula7Polimorfismo;

import java.util.Scanner;

public class CalculadoraInfixa extends Calculadora {

	@Override
	public void obter_entradas() {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		this.arg1=scanner.nextDouble();
		System.out.print("Digite o Sinal: ");
		this.sinal=scanner.next();
		System.out.print("Digite outro n�mero: ");
		this.arg2=scanner.nextDouble();
		scanner.close();

	}

}
