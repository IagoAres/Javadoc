package Javadoc;

import java.util.Scanner;

public class ejercicios {

    /**
     * Factorial hasta el número introducido desde el main.
     * @param num Variable introducida desde el main, límite del cálculo.
     * @return fact Resultado de la multiplicación de todos los números anteriores al límite.
     */
    public static int ejer1_Factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
        
    }
    
    /**
     * Sumatorio del número introducido.
     * @param num Variable int introducida desde el main.
     * @return 
     */
    public static int ejer2_Sumatorio(int num) {
        int sumatorio = 0;
        for (int i = 1; i <= num; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    public static void ejer3_Divisores() {
        int num = 10;
        System.out.println("Los divisores de " + num + "son:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    static void ejer5_MediasVarias() {
        int media_negativos = 0, cantidad_ceros = 0;
        int numero;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce el número " + i);
            numero = sc.nextInt();
            if (numero < 0) {
                media_negativos += 1;
            } else if (numero == 0) {
                cantidad_ceros += 1;
            }
        }
    }

    static void ejer6_Primos() {
        int num = 10;
        boolean primo = true;
        //Se optimizará usando while
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
    }

    static void ejer7_Escalera() {
        int tope = 10;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
