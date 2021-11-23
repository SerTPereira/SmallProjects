package com.projects.sgtp.ReadExcelFile;

import java.util.List;

public class Classe {

	private String classe_numero;
	private Integer ano_letivo;
	private String ensino;
	private String serie;
	private String turma;
	private String turno;
	
	private List<Matricula> alunosMatriculados;

	public String getClasse_numero() {
		return classe_numero;
	}

	public void setClasse_numero(String classe_numero) {
		this.classe_numero = classe_numero;
	}

	public Integer getAno_letivo() {
		return ano_letivo;
	}

	public void setAno_letivo(Integer ano_letivo) {
		this.ano_letivo = ano_letivo;
	}

	public String getEnsino() {
		return ensino;
	}

	public void setEnsino(String ensino) {
		this.ensino = ensino;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public List<Matricula> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void setAlunosMatriculados(List<Matricula> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}
	
}
