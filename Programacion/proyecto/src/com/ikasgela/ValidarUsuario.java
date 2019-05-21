package com.ikasgela;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidarUsuario {
    private JPanel validarUsuario;
    private JTextField Nombre;
    private JTextField Apellido;
    private JTextField DNI;
    private JTextField Telefono;
    private JTextField Email;
    private JPasswordField passwordField1;
    private JButton volverButton;
    private JButton validarButton;
    private JComboBox Tipo_socio;
    private JLabel Fecha_Alta;
    private JTextField Fecha_naci;
    private JLabel Cargo;

    public static JPanel menuValUsuario = new ValidarUsuario().validarUsuario;

    public ValidarUsuario() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionUsuarios.menuGestionUsuarios);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
    }

    public JPanel getValidarUsuario() {
        return validarUsuario;
    }

    public void setValidarUsuario(JPanel validarUsuario) {
        this.validarUsuario = validarUsuario;
    }

    public JTextField getNombre() {
        return Nombre;
    }

    public void setNombre(JTextField nombre) {
        Nombre = nombre;
    }

    public JTextField getApellido() {
        return Apellido;
    }

    public void setApellido(JTextField apellido) {
        Apellido = apellido;
    }

    public JTextField getDNI() {
        return DNI;
    }

    public void setDNI(JTextField DNI) {
        this.DNI = DNI;
    }

    public JTextField getTelefono() {
        return Telefono;
    }

    public void setTelefono(JTextField telefono) {
        Telefono = telefono;
    }

    public JTextField getEmail() {
        return Email;
    }

    public void setEmail(JTextField email) {
        Email = email;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
    }

    public JButton getValidarButton() {
        return validarButton;
    }

    public void setValidarButton(JButton validarButton) {
        this.validarButton = validarButton;
    }

    public JComboBox getTipo_socio() {
        return Tipo_socio;
    }

    public void setTipo_socio(JComboBox tipo_socio) {
        Tipo_socio = tipo_socio;
    }

    public JLabel getFecha_Alta() {
        return Fecha_Alta;
    }

    public void setFecha_Alta(JLabel fecha_Alta) {
        Fecha_Alta = fecha_Alta;
    }

    public JTextField getFecha_naci() {
        return Fecha_naci;
    }

    public void setFecha_naci(JTextField fecha_naci) {
        Fecha_naci = fecha_naci;
    }

    public JLabel getCargo() {
        return Cargo;
    }

    public void setCargo(JLabel cargo) {
        Cargo = cargo;
    }
}
