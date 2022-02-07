package com.josemanuel.funcion;

import java.math.BigDecimal; // importacion de la libreia math big decimal
import java.util.Scanner; // clase Scanner 
import java.util.function.Function;  // java util funcion

public class FuncionArea implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner sc) {
        
        System.out.println(" P * A / 2");   
        
        System.out.println("Introduzca (P)erímetro:"); // pedida de datos
        String pStr = sc.next();
        BigDecimal pBD = new BigDecimal(pStr); // Crear Variables bigdecimal 

        System.out.println("Introduzca (A)potema:"); //pedida de datos
        String aStr = sc.next();
        BigDecimal aBD = new BigDecimal(aStr);  // Crear Variables bigdecimal

        System.out.println("Resultado" + pBD.multiply(aBD).divide(BigDecimal.valueOf(2)).toString()); // llamada de metodos y pasada a String

        return null;
    }

    
}
