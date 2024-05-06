package EntidadesCliente;

public class Conta {
    
private Cliente titular;
private int agencia;
private int numero;
private Double saldo;

      //Construtores
		public Conta( Cliente titular , int agencia, int numero, Double saldo) {
			this.titular = titular;
			this.numero = numero;
			this.agencia = agencia;
			this.saldo = saldo;
		}


		
	  
      //Getters e setters		
		public Cliente getTitular() {
			return titular;
		} 		

		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		

		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		

		public Double getSaldo() {
			return saldo;
		}



      //METODOS   
		
		@Override
		public String toString() {
			  StringBuilder st = new StringBuilder();
			  st.append("BANCO DioIntertnational: "  + "\n");
			  st.append("TITULAR: " + getTitular().getTitular() + "\n");
			  st.append("AGENCIA:" + getAgencia()  + "\n");
			  st.append("CONTA:" + getNumero() + "\n");
			  st.append("SALDO:" + getSaldo());			
				return st.toString();
			}
        //DEPOSITA
		public void Deposita ( Double valor) {
			this.saldo += valor;
		}				
		//SAQUE
		public Boolean Saque ( Double valor ) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else {
				return false;
			}
		}
	    //TRANSFERENCIA
		public  boolean Transfere(Double valor , Conta destino) {
			
			if(this.Saque(valor)) {
				destino.Deposita(valor);
				return true;
			} else {
				return false;
			}
			
			
			
		}
}
