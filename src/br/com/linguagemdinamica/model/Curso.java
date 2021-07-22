package br.com.linguagemdinamica.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private Integer id;
	private String idioma;
	// Cardinalidade Curso 1 ------ 1 TipoCurso
	private TipoCurso tipoCurso;
	// Cardinalidade Curso 1 ------ * Turma
	private List<Turma> turmas = new ArrayList<Turma>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}
	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	public List<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	
	
}
