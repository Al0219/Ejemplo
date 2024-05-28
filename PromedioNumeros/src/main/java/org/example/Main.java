package org.example;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cantidadDeNumeros;
        float numeroIngresado, sumaNumeros = 0, promedio;
        cantidadDeNumeros = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué cantidad de números que se ingresarán?"));
        for(int i =0; i<cantidadDeNumeros; i++){
            numeroIngresado = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un número: "));
            sumaNumeros = sumaNumeros + numeroIngresado;
        }
        promedio = sumaNumeros/cantidadDeNumeros;
        JOptionPane.showMessageDialog(null, "El promedio de los números ingresados es: " + promedio);
    }
}