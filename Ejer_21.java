import javax.swing.JOptionPane;

public class Ejer_21 {/*Implemente una función llamada generarAleatorio que reciba como parámetros un número
    limInf y limSup (números enteros) y retorne un número aleatorio que se encuentre en el
    rango. */
    public static void main(String[] args) {
        String mensaje_1 = "";
        int numero_1 = 0;
        int numero_2 = 0;
        int resultado = 0;

        mensaje_1 = "ingrese dos numeros para validar si son amigos, ingrese el primero";
        numero_1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        mensaje_1 = "ingrese el segundo ";
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        resultado = Funciones.generarAleatorio(numero_1, numero_2);
        mensaje_1 = "el numero aleatorio entre " + numero_1 +  " y " + numero_2 + " es ";

        JOptionPane.showMessageDialog(null, mensaje_1 + resultado);
    }
    
}
