package aula02;

import java.util.Scanner;

public class ExercicioAula03Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String nomeColaborador, cargo;
		int codigoCargo;
		float salario, novoSalario = 0, reajuste = 0;
		
		System.out.print("Digite o nome do colaborador: ");
		nomeColaborador = input.nextLine();
		
		System.out.print("Digite o código do cargo do colaborador (de 1 a 6): ");
		codigoCargo = input.nextInt();
		
		System.out.print("Digite o salário do colaborador: R$ ");
		salario = input.nextFloat();
		
		switch (codigoCargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.1f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
		default:
			System.out.println("Código de cargo inválido!");
			return;
		}
		
		novoSalario = salario + (reajuste * salario);
		
		System.out.println("\nNome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f\n", salario);
		System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
	}


	}


