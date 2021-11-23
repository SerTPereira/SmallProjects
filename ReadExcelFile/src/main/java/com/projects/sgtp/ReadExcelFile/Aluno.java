package com.projects.sgtp.ReadExcelFile;

public class Aluno {

	private String nome;
	private String ra_numero;
	private String ra_digito;
	private String ra_estado;
	
	private String msgImport;
	
	@Override
	public String toString() {
		
		return "Aluno [Nome: " + String.format("%-60s", nome) + 
			" ; RA: " + String.format("%12s", ra_numero) + "-" + String.format("%2s", ra_digito) + 
			"/" + ra_estado + " - (" + msgImport + ")]";
		
	}
		
	public Aluno(String nome, String ra_numero, String ra_digito, String ra_estado) {
		super();
		
		this.nome = "";
		this.ra_numero = "";
		this.ra_digito = "";
		this.ra_estado = "";
		
		this.msgImport = "";
		
//		set param nome
		if (nome == null) {
			this.msgImport += "Valor nulo recebido em 'nome'.";
		} else if(nome.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += nome;
		} else {
			this.nome = nome;
		}
		
//		set param ra_numero
		if (ra_numero == null) {
			this.msgImport += "Valor nulo recebido em 'ra_numero'.";
		} else if(ra_numero.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += ra_numero; 
		} else {
			this.ra_numero = ra_numero;
		}
		
//		set param ra_digito
		if (ra_digito == null) {
			this.msgImport += "Valor nulo recebido em 'ra_digito'.";
		} else if(ra_digito.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += ra_digito; 
		} else {
			this.ra_digito = ra_digito;
		}
		
//		set param ra_estado
		if (ra_estado == null) {
			this.msgImport += "Valor nulo recebido em 'ra_estado'.";
		} else if(ra_estado.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += ra_estado; 
		} else {
			this.ra_estado = ra_estado;
		}
	
	}




//	-----------------------------------------------------------------------------------------------
//	Getter & Setter
//	-----------------------------------------------------------------------------------------------	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa_numero() {
		return ra_numero;
	}

	public void setRa_numero(String ra_numero) {
		this.ra_numero = ra_numero;
	}

	public String getRa_digito() {
		return ra_digito;
	}

	public void setRa_digito(String ra_digito) {
		this.ra_digito = ra_digito;
	}

	public String getRa_estado() {
		return ra_estado;
	}

	public void setRa_estado(String ra_estado) {
		this.ra_estado = ra_estado;
	}

	public String getMsgImport() {
		return msgImport;
	}

	public void setMsgImport(String msgImport) {
		this.msgImport = msgImport;
	}
	
	

}
