package aula03;

import java.util.Scanner;

public class ExercicioAula03Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	   
	int idade, menores = 0,maiores = 0 ;
	char continua = 'S';
	
	
	while (continua == 'S') {
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		 
		if(idade <=21)
			menores ++;
		
		if(idade >=50)
		maiores ++; 
		
		System.out.println("Deseja continuar? (S/N)");
        continua = leia.next().toUpperCase().charAt(0);
		
		
		}
		System.out.println("Total de pessoas com idade menor que 21 anos: " + menores);
        System.out.println("Total de pessoas com idade maior que 50 anos: " +maiores);
		
		
		
		
		
		
	}
	
}


