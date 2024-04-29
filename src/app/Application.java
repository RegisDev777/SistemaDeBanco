package app;

import java.util.Scanner;

import Intermediações.Cadastro;

public class Application {
      public static void main(String[] args) {
		
    	  
    	  Scanner sc = new Scanner(System.in);
    	  int option = 0;
    	  
    	  
    	  do {
    		System.out.println("-------------------------");
			System.out.println("|  DioBank International |");
			System.out.println("-------------------------");
            System.out.println("|    (1) - Cadastro      |");    	  
    	    System.out.println("|    (2) - Fechar        |");
    	    System.out.println("-------------------------");
    	         //entrada:
    	         option = sc.nextInt();
    	       
    	          switch (option) {
				case 1: {
					     Cadastro cadastro = new Cadastro();
					     cadastro.Cadastrando();
					 break;
				}
				case 2: {
					System.out.println("Obrigado pela preferencia! S2");
				    break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + option);
				}
    	          
    	         
    	         
    	         
    	         
     	    
		} while (option != 2);
    	  
    	  
    	  
    	 
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
