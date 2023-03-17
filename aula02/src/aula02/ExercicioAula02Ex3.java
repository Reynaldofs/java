package aula02;

import java.util.Scanner;

public class ExercicioAula02Ex3 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

   Scanner leia = new Scanner (System.in);
		
	int codigo,quantidade;
	double preco = 0.0;
	String produto ="";
	
	System.out.println("Digite o codigo do produto (1 a 6)");
		codigo = leia.nextInt();
		
		
		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
            preco = 10.0;
            break;
        case 2:
            produto = "X-Salada";
            preco = 15.0;
            break;
        case 3:
            produto = "X-Bacon";
            preco = 18.0;
            break;
        case 4:
            produto = "Bauru";
            preco = 12.0;
            break;
        case 5:
            produto = "Refrigerante";
            preco = 8.0;
            break;
        case 6:
            produto = "Suco de laranja";
            preco = 13.0;
            break;
        default:
            System.out.println("Código de produto inválido.");
            return;
    }	
		
		  System.out.println("Digite a quantidade de " + produto + " comprada:");
	        quantidade = leia.nextInt();

	        double valorTotal = quantidade * preco;
	        System.out.println("Valor total da conta: R$ " + valorTotal);
		
		}
		
		
		
		
	}


