import javax.swing.JOptionPane;

public class Ejer_03 {/*Implemente una función llamada esImpar que reciba como parámetro un número entero y
    retorne si este es o no un número impar. */
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        
        mensaje = "ingrese un numero entero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esImpar(num)) {
            mensaje = num + " es un numero impar ";
        }else{
            mensaje = num + " no es un numero impar ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
