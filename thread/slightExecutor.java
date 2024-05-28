package JdevCurso.cadastroAluno.thread;

import javax.swing.*;
import java.lang.Thread;

public class slightExecutor {
    public static void main(String[] args) throws InterruptedException  {

       Thread threadEmail = new Thread(thread1);
       threadEmail.start();

       Thread threadNota = new Thread(thread2);
       threadNota.start();




        System.out.println("chegou ao final do codigo em paralelo");
        JOptionPane.showMessageDialog(null, "Sistema continua executando normalmente");
    }

    private static Runnable thread2 = new Runnable() {
        @Override
        public void run() {

            for (int pos = 0;pos<10; pos++){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                /*quero executar o envio com um intervalo*/
                System.out.println("executando algo");
            }

        }
    };

    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0;pos<10; pos++){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                /*quero executar o envio com um intervalo*/
                System.out.println("executando algo");
            }

        }
    };
}
