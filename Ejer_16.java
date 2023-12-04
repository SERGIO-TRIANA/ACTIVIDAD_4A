import javax.swing.JOptionPane;

public class Ejer_16 {/*Implemente una función llamada esCompuesto que reciba como parámetros un número
    entero y retorne si este es o no es un número compuesto. */
    public static void main(String[] args) {

        int count_divisores = 0;
        String mensaje_1 = "";
        int numero = 0;

        mensaje_1 = "ingrese un numero entero para calcular si es o no compuesto";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        count_divisores = Funciones.esCompuesto(numero);

        if (count_divisores >= 3) {
            mensaje_1 = "El numero dado es compuesto";
        }
        else{mensaje_1 = "el numero no es compuesto";}
        JOptionPane.showMessageDialog(null, mensaje_1);
    }
    
}
