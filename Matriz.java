package JdevCurso.cadastroAluno;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {

        int[][] notas = new int[2][3];
        notas[0][0] = 80;
        notas[0][1] = 90;
        notas[0][2] = 95;


        notas[1][0]=51;
        notas[1][1]=50;
        notas[1][2]=60;


        System.out.println(Arrays.deepToString(notas));
    }
}
