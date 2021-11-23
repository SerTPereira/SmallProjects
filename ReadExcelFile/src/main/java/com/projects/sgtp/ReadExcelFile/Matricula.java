package com.projects.sgtp.ReadExcelFile;

public class Matricula {

	private Classe classe;
	private Aluno aluno;
	private Integer numero;
	private String situacao;
	
	
	
	public Matricula (String nome, String ra_numero, String ra_digito, String ra_estado, String situacao, Integer numero) {
		super();
		
		this.aluno = new Aluno(nome, ra_numero, ra_digito, ra_estado);
		
		this.numero = numero;
		this.situacao = (situacao == null ? "" : situacao);
	}
	
	
	
	@Override
	public String toString() {	
		return "Matricula [" + aluno + "; Número: " + String.format("%3s", numero) + " - Situação: " + String.format("%10s", situacao)  + "]";
	}


//	-----------------------------------------------------------------------------------------------
//	Getter & Setter
//	-----------------------------------------------------------------------------------------------	
	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

}
