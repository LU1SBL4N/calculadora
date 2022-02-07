package com.josemanuel.menu;

import java.util.Scanner;
import java.util.function.Function;

public class ItemMenu {

    private String mensajeMenu; // variable mensaje será una cadena 
    private Menu subMenu;  
    private Function<Scanner, Void> itemMenuFuncion;  // funcion Scanner 

    public ItemMenu(String mensajeMenu, Menu subMenu) {  // constructor con mensajemenu y submenu
        this.subMenu = subMenu;
        this.mensajeMenu = mensajeMenu;        
    }

    public ItemMenu(String mensajeMenu, Function<Scanner, Void> itemMenuFuncion) {  // Constructor con mensaje menu y funcion
        this.mensajeMenu = mensajeMenu;
        this.itemMenuFuncion = itemMenuFuncion;
    }

    public Menu getSubMenu() {    // getter para extraer el submenu
        return subMenu;
    }

    public void setSubMenu(Menu subMenu) {  // setter  de submenu  
        this.subMenu = subMenu;
    }

    public String getMensajeMenu() {  // getetr mensaje menu
        return mensajeMenu;
    }

    public void setMensajeMenu(String mensajeMenu) {   // setter mensaje menu
        this.mensajeMenu = mensajeMenu;
    }

    public Function<Scanner, Void> getItemMenuFuncion() {  // getter de menu, el menu no puede ser alterado no tiene setters
        return itemMenuFuncion;
    }

}
