import javax.swing.JOptionPane;

public class Ejer_11 {/*Implemente una función llamada cantDivisoresNeg que reciba como parámetro un número
    entero y retorne la cantidad de divisores negativos que tiene ese número. */
    public static void main(String[] args) {//este ejercicio es usando for

        String mensaje = "";
        int numero = 0;
        int divisor = 0;
        
        mensaje = "ingrese un numero entero negativo para calcular la cantidad de divisores negativos";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (numero >= 0) {
            mensaje = "Error, Ingresa un numero negativo.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        }

        divisor = Funciones.cantDivisoresNeg(numero);

        mensaje = "la cantidad de divisores negativos son " + divisor;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
