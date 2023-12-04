import javax.swing.JOptionPane;

public class Ejer_01_01 {/*Implemente una función llamada esMultiplo que reciba como parámetros dos números
    enteros y retorne si el primero es un múltiplo del segundo.
    Implemente una función llamada esDivisor que reciba como parámetros dos números
    enteros y retorne si el primero es un divisor del segundo. */
public static void main(String[] args) {
    String mensaje = "";
    int num1 = 0;
    int num2 = 0;

    mensaje = "ingrese el primer numero";
    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
    mensaje = "ingrese el segundo numero";
    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
    
    if(Funciones.esDivisible(num1, num2)){
        mensaje = num1 + " es divisible exactamente por " + num2;
    }else{
         mensaje = num1 + " no es divisible exactamente por " + num2;
    }

    JOptionPane.showMessageDialog(null, mensaje);

}
    
}
