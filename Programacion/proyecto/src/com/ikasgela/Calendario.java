package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calendario {
    private JTextArea textArea1;
    private JPanel Calendario;
    private JButton volverButton;
    private JList list1;

    public static JPanel calendarioMenu = new Calendario().Calendario;

    public Calendario() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionActividades.actividadesMenu);
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

    public JPanel getCalendario() {
        return Calendario;
    }

    public void setCalendario(JPanel calendario) {
        Calendario = calendario;
    }
}
