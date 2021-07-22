package br.com.linguagemdinamica.test;

import br.com.linguagemdinamica.model.Aluno;
import br.com.linguagemdinamica.model.Curso;
import br.com.linguagemdinamica.model.Professor;
import br.com.linguagemdinamica.model.TipoCurso;
import br.com.linguagemdinamica.model.Turma;
import br.com.linguagemdinamica.model.Unidade;

public class TesteCurso {

	public static void main(String[] args) {
		
		TipoCurso tc = new TipoCurso();
		tc.setId(1);
		tc.setDescricao("Kids");
		
		TipoCurso tc1 = new TipoCurso();
		tc1.setId(2);
		tc1.setDescricao("Advanced");
		
		//Instanciar classe Curso e preencher com os dados do curso de ingl�s
		Curso c = new Curso();
		c.setId(1);
		c.setIdioma("Ingl�s");
		c.setTipoCurso(tc);
		
		Curso c2 = new Curso();
		c2.setId(1);
		c2.setIdioma("Ingl�s");
		c2.setTipoCurso(tc1);
		
		
		//Instanciar classe Curso e preencher com os dados do curso de franc�s
		Curso c1 = new Curso();
		c1.setId(2);
		c1.setIdioma("Franc�s");
				
		//Instanciar classe Unidade e preencher os dados de uma Unidade
		Unidade u = new Unidade();
		u.setId(1);
		u.setCnpj("01234567890123");
		u.setNome("Copacabana");
		u.setEndere�o("Rua Barata Ribeiro");
		u.setEmail("copacabana@linguagemdinamica.com.br");
		u.setTelefone("21999991111");
		// e adicionar os cursos de Ingl�s e Franc�s nesta Unidade
		// u. objeto unidade
		// getCursos(). objeto ArrayList
		// add(vari�vel de um objeto curso) adicionam no objeto cole��o ArrayList o endere�o de um objeto curso
		u.getCursos().add(c);
		u.getCursos().add(c1);
		u.getCursos().add(c2);
		// u.getCursos().add(4,c2);
		
		
		Aluno a1 = new Aluno();
		a1.setId(15);
		a1.setNome("Jo�o Barros");
		
		Aluno a2 = new Aluno();
		a2.setId(16);
		a2.setNome("Maria Barros");
		
		Professor p = new Professor();
		p.setId(1);
		p.setNome("Adalberto");
		
		Turma t = new Turma();
		t.setId(1);
		t.setCodigo("TM123");
		// t. objeto turma
		// getAlunos(). objeto ArrayList
		// add(vari�vel de um objeto aluno) adicionam no objeto cole��o ArrayList o endere�o de um objeto aluno
		t.getAlunos().add(a1);
		t.getAlunos().add(a2);
		
		c1.getTurmas().add(t);
		
		t.setProfessor(p);
		
		
		
	
		System.out.println("Unidade" + " " + u.getNome() + ":" + " " + u.getCursos().size() + " " + "Curso(s)");
		System.out.println(u.getCursos().get(0).getIdioma() + " " + u.getCursos().get(0).getTipoCurso().getDescricao());
		System.out.println(u.getCursos().get(2).getIdioma() + " " + u.getCursos().get(2).getTipoCurso().getDescricao());
		System.out.println(u.getCursos().get(1).getIdioma());
		
		
	}

}
