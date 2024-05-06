package Intermediações;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import EntidadesCliente.Cliente;
import EntidadesCliente.Conta;

public class Cadastro {

	
   List<Conta> contaCriadas = new ArrayList<Conta>();
   Map<String, Cliente> ClienteCadastrados = new HashMap<String, Cliente>();
   
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
	    System.out.print("Crie uma senha (obs Dig): ");
	    String senha = sc.nextLine();			 
	    System.out.println("------------------------");
	    System.out.println();
	    System.out.println();

	    Random random = new Random();	       
	    int Agencia = random.nextInt(900) + 100;	        
	    int NumeroConta = random.nextInt(9000000) + 1000000;

	    cliente = new  Cliente(nome, cpf, rg);
	    cliente.setSenha(senha);

	    c1 = new Conta(cliente, Agencia, NumeroConta, 0.0);
	    cliente.setConta(c1);

	    contaCriadas.add(c1);

	    String chaveCliente = Agencia + "-" + NumeroConta;
	    ClienteCadastrados.put(chaveCliente, cliente);

	    if(c1 != null ) {
	        System.out.println("--------------------------------");
	        System.out.println("|         Dados da conta       |"); 
	        System.out.println("--------------------------------");
	        System.out.println(c1.toString());
	        System.out.println("--------------------------------");
	        System.out.println();
	        System.out.println("Conta criada com sucesso!! Obrigado pela preferenciaS2");
	        System.out.println();
	        
	        // Imprimir detalhes das contas criadas
	        System.out.println("Contas criadas:");
	        for (Conta conta : contaCriadas) {
	            System.out.println("AGENCIA:" + conta.getAgencia());
	            System.out.println("CONTA:" + conta.getNumero());
	            System.out.println();
	        }
	    } else {
	        throw new IllegalArgumentException("Algo de Errado!! verifique e tente Novamente...");
	    }		
	}
	
	
		
		
		
   public Cliente verificarCliente(int agencia, int numeroConta) {
	    for (Conta conta : contaCriadas) {
	        if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
	            return conta.getTitular();
	        }
	    }
	    return null; // Retorna null se nenhuma conta corresponder à agência e conta informadas
	}
	
	 
	
	
}
