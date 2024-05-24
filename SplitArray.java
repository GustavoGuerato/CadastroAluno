package JdevCurso.cadastroAluno;

public class SplitArray {

    public static void main(String[] args) {
        String texto = "gustavo,java,80,70,90,89";

        String[] textoSplitado = texto.split(",");

        System.out.println(textoSplitado[0]);
        System.out.println(textoSplitado[1]);
        System.out.println(textoSplitado[2]);
        System.out.println(textoSplitado[3]);
        System.out.println(textoSplitado[4]);
        System.out.println(textoSplitado[5]);
    }
}
