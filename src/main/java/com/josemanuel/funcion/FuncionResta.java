package com.josemanuel.funcion;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;



public class FuncionResta implements Function<Scanner, Void>{ 

    @Override
    public Void apply(Scanner sc) {  // introducir datos a traves del teclado
        
        System.out.println("\nOperación seleccionada resta:\n");
        System.out.println("A - B\n");
        
        System.out.println("Introduzca A:"); // Introduccion de datos 
        String aStr = sc.next();
        BigDecimal aBD = new BigDecimal(aStr); // Crear un objeto nuevo pasandole el String

        System.out.println("Introduzca B:");
        String bStr = sc.next();
        BigDecimal bBD = new BigDecimal(bStr);

        System.out.println("\nResultado: " + aBD.subtract(bBD).toString() + "\n");

        return null;
    }

}
