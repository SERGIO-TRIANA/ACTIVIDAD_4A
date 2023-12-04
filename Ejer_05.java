import javax.swing.JOptionPane;

public class Ejer_05 {
    public static void main(String[] args) {/*Implemente una función llamada esNegativo que reciba como parámetro un número entero
        y retorne si este es o no un número negativo. */
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero entero positivo o negativo";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esNegativo(num)) {
            mensaje = num +" es un numero negativo ";  
        }else{
            mensaje = num + " no es un numero negativo";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
