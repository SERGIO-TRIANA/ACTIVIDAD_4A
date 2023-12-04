import javax.swing.JOptionPane;

public class Ejer_06 {
    public static void main(String[] args) {/*Implemente una función llamada mayor que reciba como parámetros dos números enteros
        y retorne el mayor de estos. */
        
        String mensaje = "";
        int num_1 = 0;
        int num_2 = 0;
        int mayor = 0;

        mensaje = "ingrese el primer numero entero ";
        num_1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        mensaje = "ingrese el segundo numero entero ";
        num_2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        mayor = Funciones.mayor(num_1, num_2);

        mensaje = "el numero mayor es " + mayor;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
