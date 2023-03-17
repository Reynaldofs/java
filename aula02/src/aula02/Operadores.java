package aula02;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 2,n2 = 2, n3 = 5;
		
		System.out.println(n1 != n2 && n2 > n3);
		
		
		System.out.println("variavel N1:" + n1);
		
		System.out.println("variavel n2:" + (++n1));
		
		System.out.println("variavel N2:" +n2);
		System.out.println("variavel N2:" +(n2 ++));
		System.out.println("variavel N2:" +n2);
		
		System.out.println("variavel N2:" +(n2 += 2)); 
	} 

}
