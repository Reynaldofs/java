package aula03;

import java.util.Scanner;

public class ExercicioAula03Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0,quantidade = 0;	
		
		do {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			 if (numero != 0 && numero % 3 == 0) {
	                soma += numero;
	                quantidade++;
	            }

	        } while (numero != 0);

	        if (quantidade > 0) {
	            double media = (double) soma / quantidade;
	            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	        } else {
	            System.out.println("Não foram digitados números múltiplos de 3.");
	        }

	        leia.close();
	 }  
	}
	
	


