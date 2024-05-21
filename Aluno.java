package JdevCurso.cadastroAluno;

import java.util.ArrayList;
import java.util.List;

import JdevCurso.cadastroAluno.constante.StatusAlunos;

public class Aluno extends Pessoa {

   /* esses são os atributos da classe aluno */
   private String matricula;
   private String escola;
   private String serieMatriculado;

   private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

   public List<Disciplina> getDisciplinas() {
      return disciplinas;
   }

   public void setDisciplinas(List<Disciplina> disciplinas) {
      this.disciplinas = disciplinas;
   }

   public Aluno() {
      /* cria os dados na memoria java */}

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public int getIdade() {
      return idade;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }

   public String getNascimento() {
      return nascimento;
   }

   public void setNascimento(String nascimento) {
      this.nascimento = nascimento;
   }

   public String getRg() {
      return rg;
   }

   public void setRg(String rg) {
      this.rg = rg;
   }

   public int getNumeroCPF() {
      return numeroCPF;
   }

   public void setNumeroCPF(int numeroCPF) {
      this.numeroCPF = numeroCPF;
   }

   public String getNomeMae() {
      return nomeMae;
   }

   public void setNomeMae(String nomeMae) {
      this.nomeMae = nomeMae;
   }

   public String getNomePai() {
      return nomePai;
   }

   public void setNomePai(String nomePai) {
      this.nomePai = nomePai;
   }

   public String getMatricula() {
      return matricula;
   }

   public void setMatricula(String matricula) {
      this.matricula = matricula;
   }

   public String getEscola() {
      return escola;
   }

   public void setEscola(String escola) {
      this.escola = escola;
   }

   public String getSerieMatriculado() {
      return serieMatriculado;
   }

   public void setSerieMatriculado(String serieMatriculado) {
      this.serieMatriculado = serieMatriculado;
   }

   public double getMediaNota() {
      double somaNotas = 0.0;

      for (Disciplina disciplina : disciplinas) {
         somaNotas += disciplina.getMediaNotas();
      }
      return somaNotas / disciplinas.size();
   }

   public boolean getAlunoAprovado() {
      double media = this.getMediaNota();
      if (media >= 70) {
         return true;
      } else {
         return false;
      }
   }

   public String getAlunoAprovado2() {
      double media = this.getMediaNota();
      if (media >= 50) {
         if (media >= 70) {
            return StatusAlunos.APROVADO;
         } else {
            return StatusAlunos.RECUPERACAO;
         }
      } else {
         return StatusAlunos.REPROVADO;
      }
   }

   @Override
   public String toString() {
      return "Aluno [nome=" + nome + ", idade=" + idade + ", nascimento=" + nascimento + ", rg=" + rg + ", numeroCPF="
            + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", matricula=" + matricula + ", escola="
            + escola + ", serieMatriculado=" + serieMatriculado + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((rg == null) ? 0 : rg.hashCode());
      result = prime * result + numeroCPF;
      result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Aluno other = (Aluno) obj;
      if (rg == null) {
         if (other.rg != null)
            return false;
      } else if (!rg.equals(other.rg))
         return false;
      if (numeroCPF != other.numeroCPF)
         return false;
      if (matricula == null) {
         if (other.matricula != null)
            return false;
      } else if (!matricula.equals(other.matricula))
         return false;
      return true;
   }

   @Override
   public boolean pessoaMaiorIdade() {
      // TODO Auto-generated method stub
      return super.pessoaMaiorIdade();
   }

   @Override
   public double salario() {
      return 0;
   }

}
