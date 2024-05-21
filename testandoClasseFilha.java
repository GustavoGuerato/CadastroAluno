package JdevCurso.cadastroAluno;

public class testandoClasseFilha {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Gustavo Guerato");

        Diretor diretor = new Diretor();
        diretor.setRegistroEducacao("a4291874021");

        Secretario secretario = new Secretario();
        secretario.setAnosExperiencia(5);
    }
}
