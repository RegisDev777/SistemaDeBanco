package Intermediações;

import java.util.Random;
import java.util.Scanner;

import EntidadesCliente.Cliente;
import EntidadesCliente.Conta;

public class Cadastro {
	
	
   Cliente cliente = null;
    Conta c1 = null;
    Scanner sc = new Scanner(System.in);

	
	    //METODOS CADASTRA
		public void Cadastrando() {
			
			System.out.println("------------------------");
			System.out.println("|     Dados Pessoais   |");
			System.out.println("------------------------");
		    System.out.print("Nome:");
			 String nome = sc.nextLine().toUpperCase();
			System.out.print("Cpf:");
			 String cpf = sc.nextLine();		 
			System.out.print("Rg:"); 
			 String rg = sc.nextLine();
			System.out.println("------------------------");
			 
			System.out.println();
			System.out.println();
			 
	        
			 
			Random random = new Random();	       
		        int Agencia = random.nextInt(900) + 100;	        
		        int NumeroConta= random.nextInt(9000000) + 1000000;
			
			cliente  = new  Cliente(nome, cpf, rg);				
			c1 = new Conta(cliente, Agencia, NumeroConta, 0.0);
			c1.setTitular(cliente);
			
			if(c1 != null ) {
				System.out.println("--------------------------------");
			    System.out.println("|         Dados da conta       |"); 
			    System.out.println("--------------------------------");
		    	System.out.println(c1.toString());
		    	System.out.println("--------------------------------");
				System.out.println();
				System.out.println("Conta criada com sucesso!! Obrigado pela preferenciaS2");
				System.out.println();
				
			} else {
				throw new IllegalArgumentException("Algo de Errado!! verifique e tente Novamente...");
			}
			
			
			
			
			
		}
	
	
	
	 
	
	
}
