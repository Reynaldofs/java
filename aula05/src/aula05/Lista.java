package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		int opcao = 0;
		double nota =0.0;
		
	do {	
		
		System.out.println("1-Cadastrar nota");
		System.out.println("2-listar todas as notas");
		System.out.println("3- Buscar uma nota");
		System.out.println("4-Remover uma nota");
		System.out.println("5-Atualizar uma nota");
		System.out.println("6-Ordenar");
		System.out.println("7-Sair");
		
			opcao = leia.nextInt();
		
		
	
		
		switch(opcao) {
		
		case 1:
			System.out.println("1-Cadastrar nota");
			System.out.println("Digite uma nota");
			
			notas.add(leia.nextDouble());
			
			break;
		case 2:
			System.out.println("2-listar  notas");
			
			if(notas.isEmpty()) {
				System.out.println("Nao existem notas cadastradas!");
			}else {
				for(var eNota : notas)
					System.out.println(eNota);
			}	
			
			
			break;
		case 3:
			System.out.println(" Buscar uma nota");
			System.out.println("Digite uma nota");
			nota = leia.nextDouble();
			
			if(notas.contains(nota))
				System.out.println("A nota esta localizada na posição"+notas.indexOf(nota));
			else
				System.out.println("A nota não foi encontrada!");
			
			break;		
		case 4:
			System.out.println("4-Remover uma nota");
			System.out.println("Digite uma nota");
			nota = leia.nextDouble();
			
			notas.remove(nota);
			break;	
		case 5:
			System.out.println("5-Atualizar uma nota");
			
			System.out.println("Digite uma nota atual:");
			nota = leia.nextDouble();
			
			System.out.println("Digite a nova nota:");
			var novaNota = leia.nextDouble();
			
			notas.set(notas.indexOf(nota), novaNota);
			
			break;
		case 6:
			
			notas.sort(null);
			
			for(int contador = 0; contador < notas.size(); contador ++) {
				var xNota = notas.get(contador);
				System.out.println(xNota);
			}
			
			for(var eNota : notas) {
				if(eNota%2 == 0)
					System.out.println(eNota);
			}
		break;
		default:
			if(opcao > 7)
				System.out.println("Opção inválida!");
		}
			
		} while(opcao != 6);
		
		leia.close();
		
	
	
	}
}	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			