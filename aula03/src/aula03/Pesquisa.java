package aula03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade,sexo,esporte, contador = 0,futebolFeminino = 0,maiores18Volei = 0 ;
		char continua = 'S';
		
		while(continua =='S') {
		
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		System.out.println("Digite o sexo (1-M/2-F/3-Outros):");
		sexo = leia.nextInt();
		
		System.out.println("Digite o seu Esporte favorito (1-futebol/2-Voleibol/3-Basquete/4-Gamer):");
		esporte= leia.nextInt();

		contador ++;
		
		if(sexo == 2 && esporte ==1)
			futebolFeminino ++;
		
		if(sexo >= 2 && esporte ==2)
			maiores18Volei ++;
		
		System.out.println("Digite o continuar (S/N)?");
		continua= leia.next().toUpperCase().charAt(0);
		
		

		System.out.println("Digite o continuar "+contador);
		
		}
		

	}

}
