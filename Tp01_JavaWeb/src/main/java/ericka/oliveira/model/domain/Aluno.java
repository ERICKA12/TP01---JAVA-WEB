package ericka.oliveira.model.domain;

public class Aluno {
	
	private String nome;
	private String email;
	private String senha;
	
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	
	public void impressao() {
		System.out.println("nome: " +  nome +  "\n" + "e-mail: " + email);
		
	}
	
//	@Override
//	public String toString() {
//
//		return String.format("nome: " +  nome +  "\n" + "e-mail: " + email);
//	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
}
