package br.com.linguagemdinamica.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private Integer id;
	private String codigo;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	

}
