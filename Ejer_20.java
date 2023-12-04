import javax.swing.JOptionPane;

public class Ejer_20 {/*Implemente una función llamada sonAmigos que reciba como parámetros dos números
    enteros y retorne si estos son o no números amigos. */
    public static void main(String[] args) {
        String mensaje_1 = "";
        int numero_1 = 0;
        int numero_2 = 0;

        mensaje_1 = "ingrese dos numeros para validar si son amigos, ingrese el primero";
        numero_1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        mensaje_1 = "ingrese el segundo ";
        numero_2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));

        if (Funciones.sonAmigos(numero_1, numero_2)) {
            mensaje_1 = "son numeros amigos";
        }
        else{
            mensaje_1 = "no son numeros amigos";
        }
        JOptionPane.showMessageDialog(null, mensaje_1);
    }
    }
    

