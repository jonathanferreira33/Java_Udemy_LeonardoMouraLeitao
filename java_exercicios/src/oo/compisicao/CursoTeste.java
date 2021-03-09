package oo.compisicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Jonathan");
		Aluno aluno2 = new Aluno("Jon");
		Aluno aluno3 = new Aluno("Jhouus");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("React Native");
		Curso curso3 = new Curso("MOBILE DEVELOPMENT");
		
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		curso2.addAluno(aluno1);
		curso2.addAluno(aluno2);
		curso2.addAluno(aluno3);
		
		aluno1.addCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println(aluno.nome + " matriculado no curso: " + curso3.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado =	aluno1.getCurso("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
