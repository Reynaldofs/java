package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System .in);
		int numero;
      int vetorInterios[] = {4,5,7,6,10,1,3,2,9,8};

      float [] vetorFloat = new float [5];
		
	/*	System.out.println("Digite :");
		numero = leia.nextInt(); */
      
     /* for (int contador = 0; contador < 10; contador ++) {
    	 if (vetorInterios[contador] == numero) 
    	  System.out.println("posição  [" + contador + "] = " + vetorInterios[contador]);
      } */
      
     for (int contador = 0; contador < vetorFloat.length ; contador ++) { 
     	  System.out.println("Digite um valor para a posição  [" + contador + "]: " );
      		vetorFloat[contador]= leia.nextFloat(); 
      
      }
      
      for (float vfloat : vetorFloat) { 
     	  System.out.println(vfloat);
      		
      }
      
      Arrays.sort(vetorInterios);
      
      for (int vInt :vetorInterios) {
    	  System.out.println(vInt);
      }
      
	}

	
	
	
}
