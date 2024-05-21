package JdevCurso.cadastroAluno.Excecao;

public class ExcecaoProcessarNota extends Exception{


    public ExcecaoProcessarNota(String erro) {
        super("algo deu errado com as notas");
    }
}
