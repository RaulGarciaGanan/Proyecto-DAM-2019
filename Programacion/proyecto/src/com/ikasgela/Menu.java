package com.ikasgela;


import com.ikasgela.Clases.Socio;
import com.ikasgela.ClasesBD.GenericoBD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private JButton quieroSerSocioButton;
    private JButton soySocioButton;
    private JPanel menu;

    public static int codigo_socio=0;

    public static JPanel menuGlobal = new Menu().menu;

    public static JFrame frame = new JFrame();

    public static Connection conn;





    public static void main(String[] args) throws SQLException {

        new GenericoBD().conectar(conn);
        frame.setContentPane(menuGlobal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }


    public Menu() {
        quieroSerSocioButton.addActionListener(e -> {
            frame.setContentPane(Registro.registroMenu);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        });
        soySocioButton.addActionListener(e -> {
            frame.setContentPane(Login.loginMenu);
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
