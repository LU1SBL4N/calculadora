package com.josemanuel.funcion;

import java.math.BigDecimal; // importar la biblioteca big decimal
import java.util.Scanner;
import java.util.function.Function;

public class FuncionSuma implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner sc) {   // Introducitr datos a traves de teclado
        
        System.out.println("\nOperación seleccionada suma:\n");
        System.out.println("A + B\n");
        
        System.out.println("Introduzca A:");
        String aStr = sc.next();
        BigDecimal aBD = new BigDecimal(aStr);  // crear un objero nuevo pasandole el sc

        System.out.println("Introduzca B:");
        String bStr = sc.next();
        BigDecimal bBD = new BigDecimal(bStr);   // crear un objero nuevo  pasandole el sc


        System.out.println("\nResultado: " + aBD.add(bBD).toString() + "\n"); // pasar el resultado a String

        return null;
    }

}
