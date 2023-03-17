package aula02;

import java.util.Scanner;

public class ExercicioAula2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero:");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        if (num > 0) {
            System.out.println("O número é positivo");
        } else if (num < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }
		

			
			
	
	}

}
