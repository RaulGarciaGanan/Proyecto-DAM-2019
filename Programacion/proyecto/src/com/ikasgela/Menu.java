package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JButton quieroSerSocioButton;
    private JPanel menu;
    private JButton soySocioButton;

    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        frame.setContentPane(new Menu().menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Menu() {
        quieroSerSocioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            frame.setContentPane(new Registro().getRegistro());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            }
        });
        soySocioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setContentPane(new Login().getPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }



    public JButton getQuieroSerSocioButton() {
        return quieroSerSocioButton;
    }

    public void setQuieroSerSocioButton(JButton quieroSerSocioButton) {
        this.quieroSerSocioButton = quieroSerSocioButton;
    }

    public JPanel getMenu() {
        return menu;
    }

    public void setMenu(JPanel menu) {
        this.menu = menu;
    }

    public JButton getSoySocioButton() {
        return soySocioButton;
    }

    public void setSoySocioButton(JButton soySocioButton) {
        this.soySocioButton = soySocioButton;
    }

    public static JFrame getFrame() {
        return frame;
    }
}
