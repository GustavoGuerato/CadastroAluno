package JdevCurso.cadastroAluno.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTempo extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descriptor = new JLabel("hora thread 1");
    private JTextField descriptorField = new JTextField();
    private JLabel descriptor1 = new JLabel("hora thread 2");
    private JTextField descriptorField1 = new JTextField();
    private volatile boolean running = true;

    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");

    private Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            while (true){
                descriptorField.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
                        format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    private Runnable thread2 = new Runnable() {
        @Override
        public void run() {
            while (true){
                descriptorField1.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
                        format(Calendar.getInstance().getTime()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };


    private Thread thread1Time;
    private Thread tread2Time;

    public TelaTempo(){


        setTitle("Tela de Thread com tempo");
        setSize(new Dimension(250,250));
        setLocationRelativeTo(null);
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5,10,5,5);
        gridBagConstraints.anchor = gridBagConstraints.WEST;

        descriptor.setPreferredSize(new Dimension(200,25));
        jPanel.add(descriptor,gridBagConstraints);


        descriptorField.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(descriptorField,gridBagConstraints);

        descriptor1.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(descriptor1,gridBagConstraints);

        descriptorField1.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(descriptorField1,gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridy++;
        jPanel.add(jButton,gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridx++;
        jPanel.add(jButton2,gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thread1Time = new Thread(thread1);
                thread1Time.start();

                tread2Time = new Thread(thread2);
                tread2Time.start();


                jButton.setEnabled(false);
                jButton2.setEnabled(true);
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = false;

                jButton.setEnabled(true);
                jButton2.setEnabled(false);
            }
        });



        jButton2.setEnabled(false);
        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*sempre será o ultimo*/

    }
}
