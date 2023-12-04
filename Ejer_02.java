import javax.swing.JOptionPane;

public class Ejer_02 {/*Implemente una función llamada esPar que reciba como parámetro un número entero y
    retorne si este es o no un número par. */
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero entero ";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (Funciones.esPar(num)) {
            mensaje = num + " es un numero par ";
        }else{
              mensaje = num + " no es un numero par ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
