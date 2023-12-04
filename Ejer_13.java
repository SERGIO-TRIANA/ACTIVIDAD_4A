import javax.swing.JOptionPane;

public class Ejer_13 {/*Implemente una función llamada sumDivisoresPos que reciba como parámetro un número
    entero y retorne la suma de sus divisores positivos. */
    public static void main(String[] args) {//este ejercicio es usando while

        String mensaje = "";
        int numero = 0;
        int sum_divisores = 0;
        
        mensaje = "ingrese un numero entero para calcular la suma todos sus divisores positivos";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));

        if (numero == 0) {
            mensaje = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        }

        sum_divisores = Funciones.sumDivisoresPos(numero);

        mensaje = "la suma de divisores es " + sum_divisores;
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}