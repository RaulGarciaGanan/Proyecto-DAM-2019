package com.ikasgela;

import com.ikasgela.Clases.Socio;
import com.ikasgela.ClasesBD.GenericoBD;
import com.ikasgela.ClasesBD.SocioBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class ListadoSocios {
    private JPanel ListadoSocios;
    private JButton volverButton;
    private JList Listadosocio;
    private JButton modificarButton;
    private JButton borrarButton;
    private JButton validarButton;
    private JComboBox tipo_socio;

    public static JPanel sociosMenu;
    public static int num=0;

    static {
        try {
            sociosMenu = new ListadoSocios().ListadoSocios;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ListadoSocios() throws Exception {
        tipo_socio.addItem("Usuario");
        tipo_socio.addItem("Administrador");
        tipo_socio.addItem("Pendiente");
        SocioBD.socios.removeAll(SocioBD.socios);
        SocioBD.listadoSocio();
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < SocioBD.socios.size(); i++) {
            String socio = SocioBD.socios.get(i).getNombre() + " " + SocioBD.socios.get(i).getApellido();
            modelo.addElement(socio);
        }
        Listadosocio.setModel(modelo);

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(MenuAdministrador.menuAdmin);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num=Listadosocio.getSelectedIndex();
                Menu.getFrame().setContentPane(DatosPersonales.datosPersonalesMenu);
                Menu.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Listadosocio.getSelectedIndices()!=null){
                    try {
                        SocioBD.borrarSocio(SocioBD.socios.get(Listadosocio.getSelectedIndex()));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        validarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Listadosocio.getSelectedIndices()!=null){
                    try {
                        SocioBD.validarSocio(SocioBD.socios.get(Listadosocio.getSelectedIndex()));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        tipo_socio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (tipo_socio.getSelectedIndex()){
                    case 0:
                        SocioBD.socios.removeAll(SocioBD.socios);
                        Listadosocio.removeAll();
                        modelo.removeAllElements();
                        try {
                            SocioBD.listadoUsuarioSocio();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        for (int i = 0; i < SocioBD.socios.size(); i++) {
                            String socio = SocioBD.socios.get(i).getNombre() + " " + SocioBD.socios.get(i).getApellido();
                            modelo.addElement(socio);
                        }
                        break;

                    case 1:
                        SocioBD.socios.removeAll(SocioBD.socios);
                        Listadosocio.removeAll();
                        modelo.removeAllElements();
                        try {
                            SocioBD.listadoAdministradorSocio();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        for (int i = 0; i < SocioBD.socios.size(); i++) {
                            String socio = SocioBD.socios.get(i).getNombre() + " " + SocioBD.socios.get(i).getApellido();
                            modelo.addElement(socio);
                        }
                        break;
                    case 2:
                        SocioBD.socios.removeAll(SocioBD.socios);
                        Listadosocio.removeAll();
                        modelo.removeAllElements();
                        try {
                            SocioBD.listadoValidarSocio();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        for (int i = 0; i < SocioBD.socios.size(); i++) {
                            String socio = SocioBD.socios.get(i).getNombre() + " " + SocioBD.socios.get(i).getApellido();
                            modelo.addElement(socio);
                        }
                        break;

                }
            }
        });

    }

    public JList getListadosocio() {
        return Listadosocio;
    }

    public void setListadosocio(JList listadosocio) {
        Listadosocio = listadosocio;
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

    public JButton getModificarButton() {
        return modificarButton;
    }

    public void setModificarButton(JButton modificarButton) {
        this.modificarButton = modificarButton;
    }

    public JButton getBorrarButton() {
        return borrarButton;
    }

    public void setBorrarButton(JButton borrarButton) {
        this.borrarButton = borrarButton;
    }

    public JButton getValidarButton() {
        return validarButton;
    }

    public void setValidarButton(JButton validarButton) {
        this.validarButton = validarButton;
    }

    public JComboBox getTipo_socio() {
        return tipo_socio;
    }

    public void setTipo_socio(JComboBox tipo_socio) {
        this.tipo_socio = tipo_socio;
    }
}
