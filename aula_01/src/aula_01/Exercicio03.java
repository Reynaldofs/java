package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat ("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		float salario,adicional,horas,descontos,SalarioLiquido;
		
		
		System.out.println("Digite seu Salario Bruto:");
		salario = leia.nextFloat ();
		
		System.out.println("Digite seu Adicional Noturno:");
		adicional = leia.nextFloat ();
		
		System.out.println("Digite seu Horas Extras:");
		horas = leia.nextFloat ();
		
		System.out.println("Digite Descontos");
		descontos = leia.nextFloat ();
		
		SalarioLiquido = salario +adicional +( horas*5) - descontos;
		
		System.out.println("Salario Liquido:" + SalarioLiquido);
		
		leia.close();
		
	}

}
