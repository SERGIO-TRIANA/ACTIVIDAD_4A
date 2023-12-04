import java.util.Random;

import javax.swing.JOptionPane;

public class Funciones extends Base {// is resolved for the exercise 01
    public static boolean esDivisible(int dividendo, int divisor) {/*
                                                                    * Implemente una función llamada esMultiplo que
                                                                    * reciba como parámetros dos números
                                                                    * enteros y retorne si el primero es un múltiplo del
                                                                    * segundo.
                                                                    * Implemente una función llamada esDivisor que
                                                                    * reciba como parámetros dos números
                                                                    * enteros y retorne si el primero es un divisor del
                                                                    * segundo.
                                                                    */

        boolean esDivisible = (dividendo % divisor == 0);

        return esDivisible;
    }

    public static boolean esPar(int numero) {// is resolved for the exercise 02
        boolean esPar = esDivisible(numero, 2);

        return esPar;
    }

    public static boolean esImpar(int numero) {// is resolved for the exercise 3
        boolean esImpar = !esPar(numero);

        return esImpar;
    }

    public static boolean esPositivo(int numero) {// is resolved for the exercise 4
        boolean esPositivo = (numero > 0);

        return esPositivo;
    }

    public static boolean esNegativo(int numero) {// is resolved for the exercise 5
        boolean esNegativo = (numero < 0);

        return esNegativo;
    }

    public static int mayor(int numero_1, int numero_2) {// is resolved for the exercise 6
        int mayor = numero_1;
        if (numero_2 > mayor)
            mayor = numero_2;

        return mayor;
    }

    public static int menor(int numero_1, int numero_2) {// is resolved for the exercise 7
        int menor = numero_1;
        if (numero_2 < menor) {
            menor = numero_2;
        }
        return menor;
    }

    public static int factorial(int numero) {// is resolved for the exercise 8

        int k = 1;
        int fac = 1;
        while (k <= numero) {
            fac = fac * k;
            k += 1;
        }
        return fac;
    }

    public static int dobleFactorial(int numero) {// is resolved for the exercise 9

        int fac = 1;
        int i = 0;

        for (i = numero; i >= 1; i -= 2) {
            fac *= i;
        }
        return fac;
    }

    public static int canDivisorespos(int numero) {// is resolved for the exercise 10 with "for"

        int q_divisors = 0;
        int i = 0;

        for (i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                q_divisors++;
            }
        }
        return q_divisors;
    }

    public static int canDivisorespos_2(int numero) {// is resolved for the exercise 10 with "while"

        int q_divisors = 0;
        int i = 1;

        while (i <= numero) {
            if (numero % i == 0) {
                q_divisors++;
            }
            i++;
        }
        return q_divisors;
    }

    public static int cantDivisoresNeg_2(int numero) {// is resolved for the exercise 11 with "while"

        int q_negative_divisors = 0;
        int i = -1;

        while (i >= numero) {
            if (numero % i == 0) {
                q_negative_divisors++;
            }
            i--;
        }
        return q_negative_divisors;
    }

    public static int cantDivisoresNeg(int numero) {// is resolved for the exercise 11 with for

        int q_negative_divisors = 0;
        int i = 0;

        for (i = -1; i >= numero; i--) {
            if (numero % i == 0) {
                q_negative_divisors++;
            }
        }
        return q_negative_divisors;
    }

    public static int cantDivisores(int numero) {// is resolved for the exercise 12 using "while"

        int q_divisores = 0;
        int i = 1;

        while (i <= Math.abs(numero)) {
            if (numero % i == 0) {
                q_divisores++;
            }
            i++;
        }
        return q_divisores;
    }

    public static int sumDivisoresPos(int numero) {// was did with "while" is resolved for the exercise 13

        int sum_positive_div = 0;
        int i = 1;
        String mensaje_1 = "";

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }
        if (numero < 0) {
            numero = numero * -1;
        }
        while (i <= numero) {
            if (numero % i == 0) {
                sum_positive_div = sum_positive_div + i;
            }
            i++;
        }
        return sum_positive_div;
    }

    public static int sumDivisoresNeg(int numero) {// is resolved for the exercise 14 with "while"

        int sum_negative_div = 0;
        int i = -1;
        String mensaje_1 = "";

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }
        if (numero > 0) {
            numero = numero * -1;
        }
        while (i >= numero) {
            if (numero % i == 0) {
                sum_negative_div = sum_negative_div + i;
            }
            i--;
        }
        return sum_negative_div;
    }

    public static int sumaDivisores(int numero) {/*
                                                  * is resolved for the exercise 15 was did with "while", this is done
                                                  * considering
                                                  * all numbers as absolutes values (positives), due the sum of the
                                                  * divisors of an integer is cero so, it doesn't has sense
                                                  */

        int sum_divisores = 0;
        int sum_divisores_1 = 0;
        int i = 1;
        String mensaje_1 = "";

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }

        if (numero < 0) {
            numero = numero * -1;
        }
        while (i <= numero) {
            if (numero % i == 0) {
                sum_divisores_1 = i;
                sum_divisores = sum_divisores_1 + sum_divisores;
            }
            i++;
        }
        sum_divisores = sum_divisores * 2;
        return sum_divisores;
    }

    public static int esCompuesto(int numero) {

        int i = 1;
        String mensaje_1 = "";
        int count_divisores = 0;

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }
        if (numero < 0) {
            numero = numero * -1;
        }
        while (i <= numero) {
            if (numero % i == 0) {
                count_divisores++;
            }
            i++;
        }

        return count_divisores;
    }

    public static int esPrimo(int numero) {

        int i = 1;
        String mensaje_1 = "";
        int count_divisores = 0;

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }
        if (numero < 0) {
            numero = numero * -1;
        }
        while (i <= numero) {
            if (numero % i == 0) {
                count_divisores++;
            }
            i++;
        }
        return count_divisores;
    }

    public static boolean esPrimo_2(int numero) {/* it's a second chape to do */

        int i = 0;
        if (numero < 2) {
            return false;
        }
        for (i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long primorial(int numero) {

        int i = 1;
        String mensaje_1 = "";
        long primorial = 1;

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }
        /*
         * if (numero < 0) {
         * numero = numero * -1;
         * }
         */
        while (i <= numero) {
            i++;
            if (Funciones.esPrimo_2(i)) {
                primorial *= i;
            }
        }
        return primorial;
    }

    public static boolean esPerfecto(int numero) {/*
                                                   * function of excercise 19, here we use a filter for delete the
                                                   * number 0, also
                                                   * is used a converter of negatives to positives, then is calculeted
                                                   * the divisors until the half of the number joined, after
                                                   * is comparated if the sum of the divisors is the same to number so
                                                   * is true, otherwise is false
                                                   */

        int suma_divisores = 0;
        int i = 1;
        String mensaje_1 = "";

        while (numero == 0) {
            mensaje_1 = "Error, Ingresa un numero diferente de 0.";
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje_1));
        }
        if (numero < 0) {
            numero = numero * -1;
        }
        while (i <= numero / 2) {

            if (numero % i == 0) {
                suma_divisores += i;
            }
            i++;
        }
        if (suma_divisores == numero) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sonAmigos(int numero_1, int numero_2) { /* this function is used in exercise number 20 */

        int[] suma_divisores = { 0, 0 };
        int[] i = { 1, 1 };
        String mensaje = "";

        while (numero_1 == 0) {
            mensaje = "Error, Ingresa un numero diferente de 0.";
            numero_1 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        }
        while (numero_2 == 0) {
            mensaje = "Error, Ingresa un numero diferente de 0.";
            numero_2 = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        }
        if (numero_1 < 0) {
            numero_1 = numero_1 * -1;
        }
        if (numero_2 < 0) {
            numero_2 = numero_2 * -1;
        }

        while (i[0] <= numero_1 / 2) {

            if (numero_1 % i[0] == 0) {
                suma_divisores[0] += i[0];
            }
            i[0]++;
        }
        while (i[1] <= numero_2 / 2) {

            if (numero_2 % i[1] == 0) {
                suma_divisores[1] += i[1];
            }
            i[1]++;
        }

        if (suma_divisores[0] == numero_2 && suma_divisores[1] == numero_1) {
            return true;
        } else {
            return false;
        }

    }

    public static int generarAleatorio(int limInf, int limSup) {

        Random rand = new Random();
        int numAleat = 0;

        numAleat = rand.nextInt((limSup - limInf) + 1) + limInf;

        return numAleat;
    }

}
