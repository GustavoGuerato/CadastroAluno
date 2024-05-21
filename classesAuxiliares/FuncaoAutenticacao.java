package JdevCurso.cadastroAluno.classesAuxiliares;

import JdevCurso.cadastroAluno.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso acesso;

    public boolean autenticar(PermitirAcesso acesso) {
        return acesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.acesso = acesso;
    }

}
