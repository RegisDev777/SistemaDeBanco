package app;

import java.util.Scanner;

import Intermediações.Cadastro;
import Intermediações.Login;

public class Application {
      public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
    	  
    	  Scanner sc = new Scanner(System.in);
    	  int option = 0;
    	  
    	  
    	  do {
    		System.out.println("-------------------------");
			System.out.println("|  DioBank International |");
			System.out.println("-------------------------");
            System.out.println("|    (1) - Cadastro      |");    	  
            System.out.println("|    (2) - Entrar        |");
    	    System.out.println("|    (3) - sair          |");
    	    System.out.println("-------------------------");
    	         //entrada:
    	         option = sc.nextInt();
    	       
    	          switch (option) {
				case 1: {
					     
					     cadastro.Cadastrando();
	                      
					 break;
				}
				case 2: {
					     Login login = new Login();
					     login.login(cadastro);
				    break;
				}
				case 3: {
					    System.out.println("Obrigado Pela preferencia!!");
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + option);
				}
    	          
    	         
    	         
    	     
    	         
     	    
		} while (option != 2);
    	  
    	  
    	  
    	 
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
