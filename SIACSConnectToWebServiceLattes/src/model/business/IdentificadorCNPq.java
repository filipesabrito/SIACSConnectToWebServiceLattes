package model.business;

public class IdentificadorCNPq {
	private String cpf; 
	private String nome_completo; 
	private String dt_nascimento;


	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome_completo() {
		return nome_completo;
	}
	
	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}
	
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	
}
