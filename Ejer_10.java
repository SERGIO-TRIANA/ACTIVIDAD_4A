import javax.swing.JOptionPane;

public class Ejer_10 {/*Implemente una función llamada cantDivisoresPos que reciba como parámetro un número
    entero y retorne la cantidad de divisores postitivos que tiene ese número. */
    public static void main(String[] args) {//este ejercicio es con for
        
        String mensaje = "";
        int numero = 0;
        int divisor = 1;
        
        mensaje ="ingrese un numero entero positivo para calcular la cantidad de divisores positivos";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (numero <= 0) {
            mensaje = "Error, Ingresa un numero negativo.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        }
        divisor = Funciones.canDivisorespos(numero);

        mensaje = "la cantidad de divisores positivos son " + divisor;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
