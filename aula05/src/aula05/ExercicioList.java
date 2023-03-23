package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();
        

        String cor;

        System.out.println("Digite 5 cores ");

        for(int contador = 1; contador <=5; contador++) {

            System.out.println("\nDigite a " + contador + "º cor: ");
            cor = leia.nextLine();
            cores.add(cor);

        }

        System.out.println("\nCores Adicionadas: ");
        for ( var oCor: cores) 
            System.out.println(oCor);

       
        System.out.println("Cores em Ordem:  ");
        cores.sort(null);
            for ( var oCor: cores) {
            System.out.println(oCor);


            leia.close();
	}
	}
}
