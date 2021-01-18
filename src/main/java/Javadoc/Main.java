package Javadoc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del que quieres hayar el factorial.");
        int num = sc.nextInt();
        int fact = ejercicios.ejer1_Factorial(num);
        int sum = ejercicios.ejer2_Sumatorio(num);
        System.out.println("Resultados:"+fact+" "+sum);
        System.out.println(fact);
        System.out.print(sum);
    }
}
