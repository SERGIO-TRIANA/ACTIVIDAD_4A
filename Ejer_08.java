import javax.swing.JOptionPane;

public class Ejer_08 {
    public static void main(String[] args) {/*Implemente una función llamada factorial que reciba como parámetros un número entero y
        retorne el factorial de este. */
        
        String mensaje = "";
        int numero = 0;
        int fac = 1;

        mensaje = "ingrese un numero entero ";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        fac = Funciones.factorial(numero);

        mensaje = "el numero factorial es " + fac;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
