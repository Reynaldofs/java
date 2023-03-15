package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;
import

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat ("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,n4,Diferenca;
		String nome;
		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro valor:");
		n1 = leia.nextFloat ();
		
		System.out.println("Digite o segundo valor:");
		n2 = leia.nextFloat ();
		
		System.out.println("Digite o terceiro valor:");
		n3 = leia.nextFloat ();
		
		System.out.println("Digite o quarto valor");
		n4 = leia.nextFloat ();
		
		Diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("Salario Liquido:" + Diferenca);
		
		leia.close();
		
	}

}
