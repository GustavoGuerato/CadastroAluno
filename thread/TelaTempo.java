package JdevCurso.cadastroAluno.thread;

import javax.swing.*;
import java.awt.*;

public class TelaTempo extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descriptor = new JLabel("hora thread 1");
    private JTextField descriptorField = new JTextField();
    private JLabel descriptor1 = new JLabel("hora thread 2");
    private JTextField descriptorField1 = new JTextField();

    private JButton jButton = new JButton("Start");
    private JButton jButton2 = new JButton("Stop");



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



        add(jPanel, BorderLayout.WEST);


        setVisible(true);/*sempre será o ultimo*/

    }
}
