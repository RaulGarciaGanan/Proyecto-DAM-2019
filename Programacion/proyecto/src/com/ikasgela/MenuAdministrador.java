package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdministrador {
    private JPanel MenuAdministrador;
    private JButton gestionDeSociosButton;
    private JButton gestionDeCuotasButton;
    private JButton salidasButton;
    private JButton datosPersonalesButton;
    private JButton volverButton;
    private JButton juntasButton;
    private JLabel Cod_soc;

    public static JPanel menuAdmin = new MenuAdministrador().MenuAdministrador;

    public MenuAdministrador() {
        Cod_soc.setText(String.valueOf(Menu.codigo_socio));
        volverButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(Menu.menuGlobal);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
            Menu.getFrame().setLocationRelativeTo(null);
        });
        gestionDeSociosButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(ListadoSocios.sociosMenu);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });
        gestionDeCuotasButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(GestionCuotas.gestionCuotasCuotasMenu);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });
        salidasButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(GestionActividades.actividadesMenu);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });
        datosPersonalesButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(DatosPersonales.datosPersonalesMenu);
            Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);
            Menu.getFrame().setLocationRelativeTo(null);
        });
        juntasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(Juntas.menuJunta);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
    }

    public JButton getGestionDeSociosButton() {
        return gestionDeSociosButton;
    }

    public void setGestionDeSociosButton(JButton gestionDeSociosButton) {
        this.gestionDeSociosButton = gestionDeSociosButton;
    }

    public JPanel getMenuAdministrador() {
        return MenuAdministrador;
    }

    public void setMenuAdministrador(JPanel menuAdministrador) {
        MenuAdministrador = menuAdministrador;
    }

    public JButton getGestionDeCuotasButton() {
        return gestionDeCuotasButton;
    }

    public void setGestionDeCuotasButton(JButton gestionDeCuotasButton) {
        this.gestionDeCuotasButton = gestionDeCuotasButton;
    }

    public JButton getSalidasButton() {
        return salidasButton;
    }

    public void setSalidasButton(JButton salidasButton) {
        this.salidasButton = salidasButton;
    }

    public JButton getDatosPersonalesButton() {
        return datosPersonalesButton;
    }

    public void setDatosPersonalesButton(JButton datosPersonalesButton) {
        this.datosPersonalesButton = datosPersonalesButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }


}
