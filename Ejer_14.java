import javax.swing.JOptionPane;

public class Ejer_14 {/*Implemente una función llamada sumDivisoresNeg que reciba como parámetro un número
    entero y retorne la suma de sus divisores negativos. */
    public static void main(String[] args) {//este ejercicio es usando while

        String mensaje = "";
        int numero = 0;
        int sum_divisores_neg = 0;
        
        mensaje = "ingrese un numero entero para calcular la suma todos sus divisores negativos";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        sum_divisores_neg = Funciones.sumDivisoresNeg(numero);

        mensaje = "la suma de divisores negativos es " + sum_divisores_neg;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}