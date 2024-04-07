package model;

public class Estudante {

	private String ra;
	private String nome; 
	private String email;
	private int qtdAprovacoes;
	private float mediaNotas;
	
	public Estudante() {
		super();
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

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

	public int getQtdAprovacoes() {
		return qtdAprovacoes;
	}

	public void setQtdAprovacoes(int qtdAprovacoes) {
		this.qtdAprovacoes = qtdAprovacoes;
	}

	public float getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(float mediaNotas) {
		this.mediaNotas = mediaNotas;
	}
	
	
}
