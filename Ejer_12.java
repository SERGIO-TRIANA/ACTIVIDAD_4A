import javax.swing.JOptionPane;

public class Ejer_12 {/*Implemente una función llamada cantDivisores que reciba como parámetro un número
    entero y retorne la cantidad de divisores que tiene ese número. */
    public static void main(String[] args) {//este ejercicio es usando while

        String mensaje = "";
        int numero = 0;
        int divisor = 0;
        
        mensaje = "ingrese un numero entero para calcular todos sus divisores";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (numero == 0) {
            mensaje = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        }

        divisor = Funciones.cantDivisores(numero);
        divisor = divisor * 2;

        mensaje = "la cantidad de divisores son " + divisor;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
