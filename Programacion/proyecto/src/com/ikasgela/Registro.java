package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro {
    private JPanel Registro;
    private JTextField TFNombre;
    private JTextField TFApellido;
    private JTextField TFDNI;
    private JTextField TFTelefono;
    private JTextField TFEmail;
    private JTextField TFFecha_Naci;
    private JButton enviarButton;
    private JButton cancelarButton;
    private JTextField TFContrasena;

    public static Registro registro = new Registro();
    public static JPanel registroMenu = new Registro().Registro;

    public Registro() {
        cancelarButton.addActionListener(e -> {
            Menu.getFrame().setContentPane(Menu.menuGlobal);
            Menu.getFrame().pack();
            Menu.getFrame().setVisible(true);

        });
    }

    public JPanel getRegistro() {
        return Registro;
    }

    public void setRegistro(JPanel registro) {
        Registro = registro;
    }

    public JTextField getTFNombre() {
        return TFNombre;
    }

    public void setTFNombre(JTextField TFNombre) {
        this.TFNombre = TFNombre;
    }

    public JTextField getTFApellido() {
        return TFApellido;
    }

    public void setTFApellido(JTextField TFApellido) {
        this.TFApellido = TFApellido;
    }

    public JTextField getTFDNI() {
        return TFDNI;
    }

    public void setTFDNI(JTextField TFDNI) {
        this.TFDNI = TFDNI;
    }

    public JTextField getTFTelefono() {
        return TFTelefono;
    }

    public void setTFTelefono(JTextField TFTelefono) {
        this.TFTelefono = TFTelefono;
    }

    public JTextField getTFEmail() {
        return TFEmail;
    }

    public void setTFEmail(JTextField TFEmail) {
        this.TFEmail = TFEmail;
    }

    public JTextField getTFFecha_Naci() {
        return TFFecha_Naci;
    }

    public void setTFFecha_Naci(JTextField TFFecha_Naci) {
        this.TFFecha_Naci = TFFecha_Naci;
    }

    public JButton getEnviarButton() {
        return enviarButton;
    }

    public void setEnviarButton(JButton enviarButton) {
        this.enviarButton = enviarButton;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JTextField getTFContrasena() {
        return TFContrasena;
    }

    public void setTFContrasena(JTextField TFContrasena) {
        this.TFContrasena = TFContrasena;
    }
}
