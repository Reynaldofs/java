package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leia = new Scanner (System.in);
			
			int numeroValor;
			System.out.println("Digite o número que você deseja encontrar:");
			numeroValor = leia.nextInt();
			
			int vetorInteiros[] = {2,5,1,3,4,9,7,8,10,6};
			
			
			Arrays.sort(vetorInteiros);	
			
			
			
			
			for (int indice = 0; indice < vetorInteiros.length; indice++) {
				if(vetorInteiros [indice] ==numeroValor )
				 System.out.println("O numero "+ numeroValor + " esta na posição[" + indice +"]");
			
			}
	
				
			 if (numeroValor >= 10 ) {
				 
			 	System.out.println("Número " + numeroValor + " não encontrado! ");
			 
           
	}		
 }
			

}
