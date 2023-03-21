package aula04;

import java.util.Scanner;

import java.text.DecimalFormat;


public class ExercicioMatriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("0.00");
		
		double [] [] matrizInteiros = new double [10][4];
		
		Scanner leia = new Scanner (System.in);
		 
		double soma = 0, media = 0;
		
		double [] mediaAluno = new double [10];
		
		for(int iLinha = 0; iLinha < matrizInteiros.length; iLinha++) {
		    for(int iColuna = 0; iColuna < matrizInteiros[iLinha].length; iColuna++) {
		        System.out.println("Digite uma nota:");
		        matrizInteiros[iLinha][iColuna] = leia.nextDouble();
		    }
		}
		for(int iLinha = 0; iLinha < matrizInteiros.length; iLinha++) {
		    for(int iColuna = 0; iColuna < matrizInteiros[iLinha].length; iColuna++) {
		        soma += matrizInteiros[iLinha][iColuna];
		    }
		    media = soma / 4;
		    mediaAluno[iLinha] = media;
		    soma = 0; 
		}

		System.out.println("Media dos alunos: ");
		for (int indice = 0; indice < mediaAluno.length; indice ++ ) {
			System.out.println("Aluno" + (indice + 1)+":" + mediaAluno[indice]);
		}
	}	
		 
	}	 

