package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListadoSocios {
    private JTextArea textArea1;
    private JPanel ListadoSocios;
    private JButton volverButton;

    public static JPanel sociosMenu = new ListadoSocios().ListadoSocios;

    public ListadoSocios() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionUsuarios.menuGestionUsuarios);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(JTextArea textArea1) {
        this.textArea1 = textArea1;
    }

    public JPanel getListadoSocios() {
        return ListadoSocios;
    }

    public void setListadoSocios(JPanel listadoSocios) {
        ListadoSocios = listadoSocios;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }
}
