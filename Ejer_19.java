import javax.swing.JOptionPane;

public class Ejer_19 {/*Implemente una función llamada esPerfecto que reciba como parámetro un número entero
    y diga si este es o no es un número perfecto. */
    public static void main(String[] args) {
    
        String mensaje_1 = "";
        int numero = 0;

        mensaje_1 = "ingrese un numero entero para calcular si es perfecto";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        if (Funciones.esPerfecto(numero)) {
            mensaje_1 = "es numero perfecto";
        }
        else{
            mensaje_1 = "no es un numero perfecto";
        }
        JOptionPane.showMessageDialog(null, mensaje_1);
    }
    
}
