package EntidadesCliente;


public class Cliente {
    
private String Titular;
private String cpf;
private String rg;
private String senha;
private Conta conta;

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
	
    public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
	
	
	@Override
	public String toString() {
		return   getTitular() ;
	}

	
	public void VerificaçãoSenha(String senha) {
		   if (!senha.matches("[0-9]+")) {
		        throw new IllegalArgumentException("Senha inválida: Deve conter apenas números.");
		    } else if (senha.length() != 6) {
		        throw new IllegalArgumentException("Senha inválida: Deve conter exatamente 6 dígitos.");
		    }
	}

	
    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
	//
	
}
