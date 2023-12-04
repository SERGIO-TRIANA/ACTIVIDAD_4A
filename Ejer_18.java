import javax.swing.JOptionPane;

public class Ejer_18 {/*Implemente una función llamada primorial que reciba como parámetros un número entero
    y retorne el primorial de este. */
    public static void main(String[] args) {
        
        long num_primorial = 0;
        String mensaje_1 = "";
        int numero = 0;

        mensaje_1 = "ingrese un numero entero para calcular su primorial";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        num_primorial = Funciones.primorial(numero);
        
        mensaje_1 = "El numero primorial es " + num_primorial;
        JOptionPane.showMessageDialog(null, mensaje_1);
    }
    
}
