
package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.ContaPoupanca;
import conta.model.contaCorrente;
import conta_util.Cores;

public class Menu {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
		
		int opcao ;
		
		
		        
				// Teste da Classe Conta Corrente
				contaCorrente cc1 = new contaCorrente(1, 123, 1, "José da Silva", 0.0f, 1000.0f);
				cc1.visualizar();
				cc1.sacar(12000.0f);
				cc1.visualizar();
				cc1.depositar(5000.0f);
				cc1.visualizar();
				
		        // Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 100000.0f, 15);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();
		
		
				
		while(true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
				System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();
				
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
			case 1:
				System.out.println("\n Criar Conta");

				keyPress();
				break;
			case 2:
				System.out.println("\n Listar todas as Contas");

				keyPress();
				break;
			case 3:
				System.out.println("\n Buscar Conta por número");

				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta");

				keyPress();
				break;
			case 5:
				System.out.println("\n Apagar Conta");

				keyPress();
				break;
			case 6:
				System.out.println("\n Sacar");

				keyPress();
				break;
			case 7:
				System.out.println("\n Depositar");

				keyPress();
				break;
			case 8:
				System.out.println("\n Transferir");

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida" + Cores.TEXT_RESET);
				
				keyPress();
				break;
			}
		}
    }
    public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
    
    
    
    
    
