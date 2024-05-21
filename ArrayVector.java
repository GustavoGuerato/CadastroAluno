package JdevCurso.cadastroAluno;

import javax.swing.*;
import JdevCurso.cadastroAluno.Aluno;
import JdevCurso.cadastroAluno.Disciplina;


public class ArrayVector {
    public static void main(String[] args) {
      Aluno aluno = new Aluno();
      aluno.setNome("Gustavo");
      aluno.setEscola("sesi");

      Disciplina disciplina = new Disciplina();
      disciplina.setDisciplina("Curso Java");

      double[]notas = {8.0,9.6,4.8,9.1};
      double[]notas1 = {7.2, 5.5, 3.3, 6.8};

      disciplina.setNota(notas);

      aluno.getDisciplinas().add(disciplina);

      Disciplina disciplina1 = new Disciplina();
      disciplina1.setDisciplina("logica de programação");
      disciplina1.setNota(notas1);

      aluno.getDisciplinas().add(disciplina1);
    }
}
