import javax.swing.JOptionPane;

public class Ejer_17_02 {/*Implemente una función llamada esPrimo que reciba como parámetros un número entero y
    retorne si este es o no es un número primo. */
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero entero para calcular si es o no primo";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        
        if (Funciones.esPrimo_2(num)) {
            mensaje = "es numero primo";
        }
        else {mensaje = "no es numero primo";}
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
