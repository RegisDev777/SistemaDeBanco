package EntidadesCliente;

public class Cliente {
    
private String Titular;
private String cpf;
private String rg;
	

	//construtores
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public Cliente(String titular, String cpf, String rg) {
		this.Titular = titular;
		this.cpf = cpf;
		this.rg = rg;
	}

	
	//getters e setters
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public String toString() {
		return   getTitular() ;
	}
	
	//
	
}
