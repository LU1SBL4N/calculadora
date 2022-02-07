package com.josemanuel.funcion;

import java.util.Scanner; // Clase  Scanner
import java.util.function.Function; // Herramientta util de funcion

import com.josemanuel.menu.ExitMenuException; // importacion del exitMenu.exceotion

public class FuncionExitMenu implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner t) {  // funcion para salir del menú
        
        throw new ExitMenuException();

        //return null;
    }
    
}
