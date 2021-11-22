package com.projects.sgtp.ReadExcelFile;

public class Aluno {

	private String numero;
	private String nome;
	private String ra_numero;
	private String ra_digito;
	private String ra_estado;
	private String situacao;
	
	private String msgImport;
	
	@Override
	public String toString() {
//		return "Aluno [Num: " + numero + "; Nome: " + nome + " ; RA: " + ra_numero + "-" + ra_digito + "/" + ra_estado + " ; Situação:"  + situacao + " - (" + msgImport + ")]";
		
		return "Aluno [Num: " + String.format("%-4s", numero) + 
			"; Nome: " + String.format("%-60s", nome) + 
			" ; RA: " + String.format("%12s", ra_numero) + 
			"-" + String.format("%2s", ra_digito) + 
			"/" + ra_estado + 
			" ; Situação:"  + String.format("%-10s", situacao) + 
			" - (" + msgImport + ")]";
		
	}
		
	public Aluno(String numero, String nome, String ra_numero, String ra_digito, String ra_estado, String situacao) {
		super();
		
		this.numero = "";
		this.nome = "";
		this.ra_numero = "";
		this.ra_digito = "";
		this.ra_estado = "";
		this.situacao = "";
		this.msgImport = "";
		
//		set param numero
		if (numero == null) {
			this.msgImport += "Valor nulo recebido em 'Número'.";
		} else if (numero.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += numero;
		} else {
			this.numero = numero;
		}
		
//		set param nome
		if (nome == null) {
			this.msgImport += "Valor nulo recebido em 'Número'.";
		} else if(nome.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += nome;
		} else {
			this.nome = nome;
		}
		
//		set param ra_numero
		if (ra_numero == null) {
			this.msgImport += "Valor nulo recebido em 'Número'.";
		} else if(ra_numero.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += ra_numero; 
		} else {
			this.ra_numero = ra_numero;
		}
		
//		set param ra_digito
		if (ra_digito == null) {
			this.msgImport += "Valor nulo recebido em 'Número'.";
		} else if(ra_digito.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += ra_digito; 
		} else {
			this.ra_digito = ra_digito;
		}
		
//		set param ra_estado
		if (ra_estado == null) {
			this.msgImport += "Valor nulo recebido em 'Número'.";
		} else if(ra_estado.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += ra_estado; 
		} else {
			this.ra_estado = ra_estado;
		}
		
//		set param situacao
		if (situacao == null) {
			this.msgImport += "Valor nulo recebido em 'Número'.";
		} else if(situacao.startsWith(":: Erro ::")) {
			this.msgImport += ((this.msgImport.length() > 0) ? "; " : "");
			this.msgImport += situacao; 
		} else {
			this.situacao = situacao;
		}
	}



	public void importDataNumero(String numeroInput) {
		if (numeroInput == null) {
			msgImport += "Valor nulo recebido em 'Número'.";
		}
		
		if(numeroInput.startsWith(":: Erro ::")) {
			msgImport += numeroInput.substring(9); 
		}
		
		numero = numeroInput;
	}
	
	public void importDataNome(String nomeInput) {
		if (nomeInput == null) {
			msgImport += "Valor nulo recebido em 'Número'.";
		}
		
		if(nomeInput.startsWith(":: Erro ::")) {
			msgImport += nomeInput.substring(9); 
		}
		
		nome = nomeInput;
	}
	
	public void importDataRANumero(String raNumInput) {
		if (raNumInput == null) {
			msgImport += "Valor nulo recebido em 'Número'.";
		}
		
		if(raNumInput.startsWith(":: Erro ::")) {
			msgImport += raNumInput.substring(9); 
		}
		
		ra_numero = raNumInput;
	}
	
	public void importDataRADigito(String raDigInput) {
		if (raDigInput == null) {
			msgImport += "Valor nulo recebido em 'Número'.";
		}
		
		if(raDigInput.startsWith(":: Erro ::")) {
			msgImport += raDigInput.substring(9); 
		}
		
		ra_digito = raDigInput;
	}
	
	public void importDataRAEstado(String raUFInput) {
		if (raUFInput == null) {
			msgImport += "Valor nulo recebido em 'Número'.";
		}
		
		if(raUFInput.startsWith(":: Erro ::")) {
			msgImport += raUFInput.substring(9); 
		}
		
		ra_estado = raUFInput;
	}
	
	public void importDataRASituacao(String situacaoInput) {
		if (situacaoInput == null) {
			msgImport += "Valor nulo recebido em 'Número'.";
		}
		
		if(situacaoInput.startsWith(":: Erro ::")) {
			msgImport += situacaoInput.substring(9); 
		}
		
		situacao = situacaoInput;
	}
//	-----------------------------------------------------------------------------------------------
//	Getter & Setter
//	-----------------------------------------------------------------------------------------------	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getMsgImport() {
		return msgImport;
	}

	public void setMsgImport(String msgImport) {
		this.msgImport = msgImport;
	}
	
	

}
