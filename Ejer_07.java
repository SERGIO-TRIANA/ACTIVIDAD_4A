import javax.swing.JOptionPane;

public class Ejer_07 {
    public static void main(String[] args) {/*Implemente una función llamada menor que reciba como parámetro dos números enteros y
        retorne el menor de estos. */

        String mensaje = "";
        int num_1 = 0;
        int num_2 = 0;
        int menor = 0;

        mensaje = "ingrese el primer numero entero ";
        num_1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "ingrese el segundo numero entero ";
        num_2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        
        menor = Funciones.menor(num_1, num_2);

        mensaje = "el numero menor es " + menor;
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
    
}
