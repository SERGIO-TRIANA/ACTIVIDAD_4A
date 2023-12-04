import javax.swing.JOptionPane;

public class Ejer_17 {/*Implemente una función llamada esPrimo que reciba como parámetros un número entero y
    retorne si este es o no es un número primo. */
    public static void main(String[] args) {

        int count_divisores = 0;
        String mensaje_1 = "";
        int numero = 0;

        mensaje_1 = "ingrese un numero entero para calcular si es o no primo";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        count_divisores = Funciones.esPrimo(numero);

        if (count_divisores == 2) {
            mensaje_1 = "El numero dado es primo";
        }
        else{mensaje_1 = "el numero no es primo";}
        JOptionPane.showMessageDialog(null, mensaje_1);
    }
    
}
    

