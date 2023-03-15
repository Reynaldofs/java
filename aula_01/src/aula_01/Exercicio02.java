package aula_01;


import java.util.InputMismatchException;
import  java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat ("###,###,##0.00");
		Scanner leia = new Scanner(System.in);
		
		float nota1,nota2,nota3,nota4,Mediafinal;
		
		
		System.out.println("Digite sua Primeira nota");
		nota1 = leia.nextFloat ();
		
		System.out.println("Digite sua Segunda nota");
		nota2 = leia.nextFloat ();
		
		System.out.println("Digite sua  Teceira nota");
		nota3 = leia.nextFloat ();
		
		System.out.println("Digite sua Quarta nota");
		nota4 = leia.nextFloat ();
		
		Mediafinal =( nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Media Final:" + Mediafinal);
		
		leia.close();

	}

}
