package JdevCurso.cadastroAluno.thread;

import java.util.Objects;

import static JdevCurso.cadastroAluno.thread.ImplementacaoFilaThread.pilha_fila;

public class ObjetoFilaThread {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoFilaThread that = (ObjetoFilaThread) o;
        return Objects.equals(nome, that.nome) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    public static void add(ObjetoFilaThread objetoFilaThread ){
        pilha_fila.add(objetoFilaThread);
    }
}
