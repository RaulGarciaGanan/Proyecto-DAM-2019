package com.ikasgela.Clases;


import com.ikasgela.Menu;
import com.ikasgela.MenuAdministrador;

public class Proyecto {

    public static void inicioRoot(){
        Menu.getFrame().setContentPane(new MenuAdministrador().getMenuAdministrador());
        Menu.getFrame().pack();
        Menu.getFrame().setVisible(true);
        Menu.getFrame().setLocationRelativeTo(null);
    }
}
