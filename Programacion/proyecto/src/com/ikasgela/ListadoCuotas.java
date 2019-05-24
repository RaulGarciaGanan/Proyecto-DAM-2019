package com.ikasgela;

import com.ikasgela.ClasesBD.CuotaBD;
import com.ikasgela.ClasesBD.SocioBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListadoCuotas {
    private JTextArea textArea1;
    private JPanel listadoCuotas;
    private JButton volverButton;
    private JButton modificarButton;
    private JButton borrarButton;
    private JButton anexionarCuotaASocioButton;
    private JList listado_cuotas;

    public static JPanel menuListadoCuotas = new ListadoCuotas().listadoCuotas;

    public ListadoCuotas() {
        CuotaBD.cuotas.removeAll(CuotaBD.cuotas);
        try {
            CuotaBD.listadoCuota();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < CuotaBD.cuotas.size(); i++) {
            String socio = CuotaBD.cuotas.get(i).getCod_soc() + " " + SocioBD.socios.get(i).getTipo();
            modelo.addElement(socio);
        }
        listado_cuotas.setModel(modelo);
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.getFrame().setContentPane(GestionCuotas.gestionCuotasCuotasMenu);
                Menu.getFrame().pack();
                Menu.getFrame().setVisible(true);
                Menu.getFrame().setLocationRelativeTo(null);
            }
        });
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        anexionarCuotaASocioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
