import javax.swing.JOptionPane;

public class Ejer_15 {/*Implemente una función llamada sumDivisores que reciba como parámetro un número
    entero y retorne la suma de sus divisores. */
    public static void main(String[] args) {//este ejercicio es usando while

        String mensaje = "";
        int numero = 0;
        int sum_divisores_1 = 0;
        
        mensaje = "ingrese un numero entero para calcular la suma todos sus divisores";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sum_divisores_1 = Funciones.sumaDivisores(numero);

        mensaje = "la suma de todos los divisores es " + sum_divisores_1;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}