package CursoJava.EX9;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?: ");

        int i, n = sc.nextInt();
        int[] numeros = new int[n];

        for( i = 0; i < numeros.length; i++){

            System.out.println("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");
        for (i = 0; i < numeros.length; i++){
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }


    }
}
