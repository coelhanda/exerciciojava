package exerc2;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
	    int numero, ht;
	    double vh, salario; 

	    numero = sc.nextInt();
	    ht = sc.nextInt();
	    vh = sc.nextDouble();
	    
	    salario = ht * vh;
	    
	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = $ %.2f%n", salario);
	    
	    sc.close();
	}

}
