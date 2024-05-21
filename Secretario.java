package JdevCurso.cadastroAluno;

import JdevCurso.cadastroAluno.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
    private String registro;
    private String nivelCargo;
    private int anosExperiencia;

    private String login;
    private String senha;

    public Secretario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Secretario() {
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", anosExperiencia="
                + anosExperiencia + "]";
    }

    @Override
    public boolean pessoaMaiorIdade() {
        if (idade < 18) {
            return false;
        } else {
            return true;
        }
    }

    public String msgMaiorIdade() {
        return this.pessoaMaiorIdade() ? "a pessoa tem a idade necessaria para ser contratado"
                : "a pessoa não tem a idade minima";
    }

    @Override
    public double salario() {
        // TODO Auto-generated method stub
        return 2500.00;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        this.login = login;
        this.senha = senha; 
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return false;
    }

}
