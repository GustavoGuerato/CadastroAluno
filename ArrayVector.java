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
            if (disc.getNota()[pos]<notaMax){
              notaMax = disc.getNota()[pos];
            }
          }

        }

        System.out.println("A menor nota da " + disc.getDisciplina() + "com o valor de " + notaMax);

      }


      Aluno[]arrayAlunos = new Aluno[1];
      arrayAlunos[0] = aluno;

      for (int pos = 0;pos <arrayAlunos.length;pos++){

        System.out.println("Nome do aluno é " + arrayAlunos[pos].getNome());

        for (Disciplina d : arrayAlunos[pos].getDisciplinas()){
          System.out.println("Nome da Disciplina " + d.getDisciplina());

          for (int posnota=0;posnota<d.getNota().length;posnota++){
            System.out.println("o valor das notas são:  " + posnota + "é igual ha " + d.getNota()[posnota]);
          }
        }
      }
    }
}
