package com.ikasgela;



import com.ikasgela.ClasesBD.GenericoBD;

import javax.swing.*;
import java.sql.SQLException;

public class Menu {
    private JButton quieroSerSocioButton;
    private JButton soySocioButton;
    private JPanel menu;

    public static JPanel menuGlobal = new Menu().menu;

     public static JFrame frame = new JFrame();

    public static void main(String[] args) throws SQLException {
        new GenericoBD().conectar();
        frame.setContentPane(menuGlobal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public Menu() {
        quieroSerSocioButton.addActionListener(e -> {
            frame.setContentPane(new Registro().getRegistro());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        });
        soySocioButton.addActionListener(e -> {
            frame.setContentPane(new Login().getPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
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
