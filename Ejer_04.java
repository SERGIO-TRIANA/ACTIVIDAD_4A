import java.net.Inet4Address;

import javax.swing.JOptionPane;

public class Ejer_04 {/*Implemente una función llamada esPositivo que reciba como parámetro un número entero
    y retorne si este es o no un número positivo. */
    public static void main(String[] args) {
        
        String mensaje = "";
        int num = 0;

        mensaje = "ingrese un numero enteero positivo o negativo";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPositivo(num)) {
            mensaje = num + " es un numero positivo";
        }else{
            mensaje = num + " no es un numero positivo";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
