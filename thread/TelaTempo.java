package JdevCurso.cadastroAluno.thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTempo extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descriptor = new JLabel("Nome");
    private JTextField descriptorField = new JTextField();
    private JLabel descriptor1 = new JLabel("Email");
    private JTextField descriptorField1 = new JTextField();
    private volatile boolean running = true;

    private JButton jButton = new JButton("Add lista");
    private JButton jButton1 = new JButton("Stop");


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

        jButton1.setPreferredSize(new Dimension(92,25));
        gridBagConstraints.gridx++;
        jPanel.add(jButton1,gridBagConstraints);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObjetoFilaThread filaThread = new ObjetoFilaThread();
                filaThread.setNome(descriptor.getText());
                filaThread.setEmail(descriptor1.getText());

                filaThread.add(filaThread);


            }
        });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });


        ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true);/*sempre será o ultimo*/

    }
}
