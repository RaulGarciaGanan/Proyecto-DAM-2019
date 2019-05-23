package com.ikasgela;

import com.ikasgela.Clases.Socio;
import com.ikasgela.ClasesBD.SocioBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class DatosPersonales {
    private JPanel DatosPersonal;
    private JLabel JLCodSocio;
    private JLabel JLFechaAlta;
    private JLabel JLTipo_Socio;
    private JLabel JLCargo;
    private JButton guardarButton;
    private JButton volverButton;
    private JTextField TFNombre;
    private JTextField TFApellido;
    private JTextField TFDNI;
    private JTextField TFTelefono;
    private JTextField TFEmail;
    private JTextField TFFechaNacimiento;
    private JPasswordField TFContreasena;

    public static JPanel datosPersonalesMenu = new DatosPersonales().DatosPersonal;

    public DatosPersonales() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });

        JLCodSocio.setText(SocioBD.socios.get(ListadoSocios.num).getCodSocio());
        TFNombre.setText(SocioBD.socios.get(ListadoSocios.num).getNombre());
        TFApellido.setText(SocioBD.socios.get(ListadoSocios.num).getApellido());
        TFDNI.setText(SocioBD.socios.get(ListadoSocios.num).getDNI());
        TFTelefono.setText(String.valueOf(SocioBD.socios.get(ListadoSocios.num).getTelefono()));
        TFEmail.setText(SocioBD.socios.get(ListadoSocios.num).getEmail());
        TFContreasena.setText(SocioBD.socios.get(ListadoSocios.num).getContrasena());
        TFFechaNacimiento.setText(SocioBD.socios.get(ListadoSocios.num).getFecha_Nacimiento().toString());
        JLTipo_Socio.setText(SocioBD.socios.get(ListadoSocios.num).getTipo());
        JLCargo.setText(SocioBD.socios.get(ListadoSocios.num).getCargo());
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Socio soc = new Socio();
                soc.setNombre(TFNombre.getText());
                soc.setApellido(TFApellido.getText());
                soc.setDNI(TFDNI.getText());
                soc.setTelefono(Integer.parseInt(TFTelefono.getText()));
                soc.setEmail(TFEmail.getText());
                soc.setContrasena(TFContreasena.getText());
                soc.setFecha_Nacimiento(LocalDate.parse(TFFechaNacimiento.getText()));
                try {
                    SocioBD.actualizarSocio(soc);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
    }

    public JPanel getDatosPersonal() {
        return DatosPersonal;
    }

    public void setDatosPersonal(JPanel datosPersonal) {
        DatosPersonal = datosPersonal;
    }

    public JLabel getJLCodSocio() {
        return JLCodSocio;
    }

    public void setJLCodSocio(JLabel JLCodSocio) {
        this.JLCodSocio = JLCodSocio;
    }

    public JLabel getJLFechaAlta() {
        return JLFechaAlta;
    }

    public void setJLFechaAlta(JLabel JLFechaAlta) {
        this.JLFechaAlta = JLFechaAlta;
    }

    public JLabel getJLTipo_Socio() {
        return JLTipo_Socio;
    }

    public void setJLTipo_Socio(JLabel JLTipo_Socio) {
        this.JLTipo_Socio = JLTipo_Socio;
    }

    public JLabel getJLCargo() {
        return JLCargo;
    }

    public void setJLCargo(JLabel JLCargo) {
        this.JLCargo = JLCargo;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public void setGuardarButton(JButton guardarButton) {
        this.guardarButton = guardarButton;
    }

    public JButton getVolverButton() {
        return volverButton;
    }

    public void setVolverButton(JButton volverButton) {
        this.volverButton = volverButton;
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

    public JTextField getTFFechaNacimiento() {
        return TFFechaNacimiento;
    }

    public void setTFFechaNacimiento(JTextField TFFechaNacimiento) {
        this.TFFechaNacimiento = TFFechaNacimiento;
    }

    public JPasswordField getTFContreasena() {
        return TFContreasena;
    }

    public void setTFContreasena(JPasswordField TFContreasena) {
        this.TFContreasena = TFContreasena;
    }
}
