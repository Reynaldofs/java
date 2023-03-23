package aula05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> novo = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		
		
		int opcao = 0;
		 String nome = "";
	do {	
		
		System.out.println("--------------------------------------");
		System.out.println("1- Adicionar um novo Cliente na fila");
		System.out.println("2- Listar todos os Clientes na fila");
		System.out.println("3- Retirar Cliente da fila");
		System.out.println("0- Sair");
		System.out.println("-------------------------------------");
		opcao = leia.nextInt();
		

	
	switch(opcao) {
	
	case 1: 
		System.out.println("Digite o nome do cliente: ");
		
		nome = leia.next();
		novo.add(nome);
		
		System.out.println( "Cliente Adicionado!\n");
	break;			
				
	case 2:
		System.out.println("----Lista de Clientes na Fila---- ");

		for(var cle : novo)
			System.out.println(cle);
		
		break;
		
	case 3:	
		System.out.println("Retirar Cliente da fila");
		novo.poll();
		break;
	
	  default:
		   if(opcao > 3);
		System.out.println("Opção invalida \\n");
		break;
	 
			}		
		
	}while(opcao != 0);		
	
	System.out.println("Programa finalizado! ");
	    leia.close();
	}
	}
