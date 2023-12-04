import javax.swing.JOptionPane;

public class Ejer_09 {
    public static void main(String[] args) {/*Implemente una función llamada dobleFactorial que reciba como parámetros un número
        entero y retorne el doble factorial de este. */
        
        String mensaje = "";
        int numero = 0;
        int fac = 1;

        mensaje ="ingrese un numero entero para calcular el doble de su factorial";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        fac = Funciones.dobleFactorial(numero);

        mensaje = "el numero factorial es " + fac;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
