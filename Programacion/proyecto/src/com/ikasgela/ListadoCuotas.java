package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListadoCuotas {
    private JTextArea textArea1;
    private JPanel listadoCuotas;
    private JButton volverButton;

    public static JPanel menuListadoCuotas = new ListadoCuotas().listadoCuotas;

    public ListadoCuotas() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(Cuotas.cuotasMenu);
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

    public JPanel getListadoCuotas() {
        return listadoCuotas;
    }

    public void setListadoCuotas(JPanel listadoCuotas) {
        this.listadoCuotas = listadoCuotas;
    }
}
