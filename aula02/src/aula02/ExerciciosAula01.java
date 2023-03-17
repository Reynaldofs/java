package aula02;

import java.util.Scanner;

public class ExerciciosAula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o seu primeiro valor:");
		a = leia.nextInt();
		
		System.out.println("Digite o seu segundo valor:");
		b = leia.nextInt();
		
		System.out.println("Digite o seu teceiro valor:");
		c = leia.nextInt();
		
	    if ((a + b) > c) 
		System.out.println("A soma entre a e b maior que c");
		
		else if ((a + b) < c) 
		System.out.println("A soma entre a e b menor que c");
		
		else if ((a + b ) >= c) 
			System.out.println("A soma entre a e b  igual a c");
		
		
	}

}
