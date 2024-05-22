package JdevCurso.cadastroAluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

import JdevCurso.cadastroAluno.classesAuxiliares.FuncaoAutenticacao;
import JdevCurso.cadastroAluno.constante.StatusAlunos;
import JdevCurso.cadastroAluno.interfaces.PermitirAcesso;

public class cadastraAluno {

  public static void main(String[] args) {
    String login = JOptionPane.showInputDialog("Coloque seu login");
    String senha = JOptionPane.showInputDialog("Coloque sua senha");

    FuncaoAutenticacao autenticar = new FuncaoAutenticacao(null);
    PermitirAcesso permitiracesso = new Secretario(login, senha);

    if (new FuncaoAutenticacao(permitiracesso).autenticar(permitiracesso)) {
      List<Aluno> alunos = new ArrayList<>();
      HashMap<String, List<Aluno>> maps = new HashMap<>();

      for (int qtd = 1; qtd <= 2; qtd++) {
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: " + qtd));
        String nascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno: " + qtd);
        String rg = JOptionPane.showInputDialog("Qual o RG do aluno: " + qtd);
        int cpfAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o CPF do aluno: " + qtd));
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno: ");
        String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno: ");
        String matricula = JOptionPane.showInputDialog("Qual a data de matrícula do aluno: ");
        String escola = JOptionPane.showInputDialog("Qual o nome da escola que o aluno está se matriculando: ");
        String serieMatriculado = JOptionPane.showInputDialog("Qual a série do aluno: ");

        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setIdade(idadeAluno);
        aluno1.setNascimento(nascimento);
        aluno1.setRg(rg);
        aluno1.setNumeroCPF(cpfAluno);
        aluno1.setNomeMae(nomeMae);
        aluno1.setNomePai(nomePai);
        aluno1.setMatricula(matricula);
        aluno1.setEscola(escola);
        aluno1.setSerieMatriculado(serieMatriculado);

        for (int pos = 1; pos <= 1; pos++) {
          String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + "? ");
          double[] notas = new double[4];
          for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da nota " + (i + 1) + " para a disciplina " + nomeDisciplina + ": "));
          }

          Disciplina disciplina = new Disciplina();
          disciplina.setDisciplina(nomeDisciplina);
          disciplina.setNota(notas); // Passando o array de notas

          aluno1.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

        if (escolha == 0) {
          int continuarRemovendo = 0;
          while (continuarRemovendo == 0) {
            String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover? 1,2,3,4,5,6,7,8,9,10,11 ou 12");
            aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
            continuarRemovendo = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina? ");
          }
        }
        alunos.add(aluno1);
      }

      for (Aluno aluno : alunos) {
        System.out.println("Aluno " + aluno.getNome());
        System.out.println("Média do aluno " + aluno.getNome() + " é: " + aluno.getMediaNota());
        System.out.println("Resultado: " + aluno.getAlunoAprovado2());

        for (Disciplina disc : aluno.getDisciplinas()) {
          System.out.println("As disciplinas disponíveis são: ");
          System.out.println(disc.getDisciplina());
          System.out.println("E suas notas são: " + Arrays.toString(disc.getNota()));
        }
      }

      maps.put(StatusAlunos.APROVADO, new ArrayList<>());
      maps.put(StatusAlunos.RECUPERACAO, new ArrayList<>());
      maps.put(StatusAlunos.REPROVADO, new ArrayList<>());

      for (Aluno aluno : alunos) {
        if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.APROVADO)) {
          maps.get(StatusAlunos.APROVADO).add(aluno);
        } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.RECUPERACAO)) {
          maps.get(StatusAlunos.RECUPERACAO).add(aluno);
        } else {
          maps.get(StatusAlunos.REPROVADO).add(aluno);
        }
      }

      System.out.println("Lista dos alunos aprovados: ");
      for (Aluno aluno : maps.get(StatusAlunos.APROVADO)) {
        System.out.println("O aluno:  " + aluno.getNome());
        System.out.println("Teve o resultado: " + aluno.getAlunoAprovado2());
      }

      System.out.println("Lista dos alunos em recuperação: ");
      for (Aluno aluno : maps.get(StatusAlunos.RECUPERACAO)) {
        System.out.println("O aluno:  " + aluno.getNome());
        System.out.println("Teve o resultado: " + aluno.getAlunoAprovado2());
        System.out.println("");
      }

      System.out.println("Lista dos alunos reprovados: ");
      for (Aluno aluno : maps.get(StatusAlunos.REPROVADO)) {
        System.out.println("O aluno:  " + aluno.getNome());
        System.out.println("Teve o resultado: " + aluno.getAlunoAprovado2());
      }
    } else {
      System.out.println("Você errou alguma credencial");
    }
  }
}
