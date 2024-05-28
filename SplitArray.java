package JdevCurso.cadastroAluno;

import java.util.Arrays;
import java.util.List;

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

        List<String> list = Arrays.asList(textoSplitado);

        for (String valorString : list) {
            System.out.println(valorString);
        }

        String[] conversaoArray = list.toArray(new String[6]);

        System.out.println(Arrays.toString(conversaoArray));
    }
}
