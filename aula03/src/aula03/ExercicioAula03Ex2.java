package aula03;

import java.util.Scanner;

public class ExercicioAula03Ex2 {
	

		    public static void main(String[] args) {
		        
		        Scanner leia = new Scanner(System.in);
		        
		        int idade, sexo, categoria, backend = 0, frontendFeminino = 0, mobileMasculino = 0, fullstackFeminino = 0;
		        char continuar;
		        
		        do {
		            System.out.print("Digite a Idade: ");
		            idade = leia.nextInt();
		            
		            System.out.print("Digite o Sexo (1-Masculino, 2-Feminino, 3-Outros): ");
		            sexo = leia.nextInt();
		            
		            System.out.print("Digite a Categoria (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
		            categoria = leia.nextInt();
		            
		            if (categoria == 1) { // Pessoa desenvolvedora Backend
		                backend++;
		            } else if (categoria == 2 && sexo == 2) { // Mulher desenvolvedora Frontend
		                frontendFeminino++;
		            } else if (categoria == 3 && sexo == 1 && idade > 40) { // Homem desenvolvedor Mobile maiores de 40 anos
		                mobileMasculino++;
		            } else if (categoria == 4 && sexo == 2 && idade < 30) { // Mulher desenvolvedora FullStack menores de 30 anos
		                fullstackFeminino++;
		            }
		            
		            System.out.print("Deseja continuar (S/N)? ");
		            continuar = leia.next().charAt(0);
		            
		        } while (continuar == 'S' || continuar == 's');
		        
		        // Resultado da análise
		        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
		        System.out.println("Total de mulheres desenvolvedoras Frontend: " + frontendFeminino);
		        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobileMasculino);
		        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstackFeminino);
		        
		        leia.close();
		    }

		}


