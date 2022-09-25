/**
 * @author DAW120
   📌 EJERCICIO 5, Hoja 1.
 
   🔴 Diseñar programa Java de nombre ejercicio5 que calcule la suma, 
   resta, multiplicación y división de dos números introducidos por teclado. 
 
   🔴 Incorporar las funciones que permitan realizar la potencia del primer 
   número y la raíz cuadrada.
 */

package com.solomongo.ejercicio5_hoja1;
import javax.swing.JOptionPane;  //el import aqui entre paquete y la clase
import java.util.*; // este llego de la raiz cuadrada..

public class Ejercicio5_Hoja1 {
    public static void main(String[] args) {
       
        String operacion;  // definir variable tipo string (asume todo),
        String operacion2; // para almacenar los datos recogidos por la caja de texto
        double numero1,numero2; // tambien se define con tipo double (.0) la variable resultado
         
        // 🏴‍ ENTRADA:
        // se asigna por expresion (=) el valor introducido por TECLADO:
        operacion =JOptionPane.showInputDialog("INTRODUCE UN NUMERO ⤵");
        operacion2 =JOptionPane.showInputDialog(" 🚀 AHORA METE OTRO NUMERO:");
        numero1=Double.parseDouble(operacion);
        numero2=Double.parseDouble(operacion2);

        //////////////////////////////////////////

        // 🏴‍ SALIDA:   
        // aqui va la salida que saca el metodo anterior:
        System.out.println("Introduce el primer numero: "+operacion);
        System.out.println("Introduce el segundo numero: "+operacion2);   
        // enredando con TERNARIOS: como bool, pero con valores:
        // si se cumple (?) saca primer valor; sino (:) el segundo..
        System.out.printf("x= ");   
        System.out.print(operacion2==operacion?operacion2:operacion+" y = ");
        System.out.print(operacion!=operacion?operacion2:operacion2+"\n");
        // en estas sentencias se realizan las operaciones:
        System.out.print("x + y = "+(numero1+numero2+"\n"));
        System.out.print("x - y = "+(numero1-numero2+"\n"));
        System.out.print("x * y = "+(numero1*numero2+"\n"));
        System.out.print("x / y = "+(numero1/numero2+"\n"));
        System.out.print("x ^ 2 = "+(numero1*numero1+"\n"));
       
        // aqui para hacer la raiz√  se importa java.util encima
        // el metodo para el calculo es sqrt(), dentro de la libreria Math..
        double resultado = Math.sqrt(numero1); // el parametro que entra debe ser un número..
        // el resultado que saca será un double:
        System.out.println("V x = "+resultado);   
        
    }
}
