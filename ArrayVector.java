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

      System.out.println("nome do aluno é " + aluno.getNome() + " inscrito no curso: " + aluno.getEscola());

      for (Disciplina disc : aluno.getDisciplinas()){
        System.out.println("---------disciplina do aluno--------");
        System.out.println("Disciplina: " + disc.getDisciplina());
        System.out.println("As notas Das disciplinas são: ");

        double notaMax = 0.0;

        for (int pos = 0;pos< disc.getNota().length;pos++){
          System.out.println("Nota " + pos + "é igual" + disc.getNota()[pos]);
          if (pos ==0){
            notaMax = disc.getNota()[pos];
          }else{
            if (disc.getNota()[pos]>notaMax){
              notaMax = disc.getNota()[pos];
            }
          }
        }

        System.out.println("A maior nota da " + disc.getDisciplina() + "com o valor de " + notaMax);

      }
    }
}
