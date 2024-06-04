package JdevCurso.cadastroAluno.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread ){
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        System.out.println("algo ai");


        while (true) {

            synchronized (pilha_fila) {
                Iterator interacao = pilha_fila.iterator();
                while (interacao.hasNext()) {
                    ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next();


                    interacao.remove();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }



}
