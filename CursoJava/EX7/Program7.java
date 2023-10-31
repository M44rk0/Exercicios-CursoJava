package CursoJava.EX7;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;
        double soma = 0;
        System.out.println("Digite um número inteiro: ");
        N = sc.nextInt();
        double[] vect = new double[N];

        for(int i = 0; i < N; i++){
           vect[i] = sc.nextDouble();
           soma += vect[i];
        }

        double media = soma / N;

        System.out.println("Média: " + String.format("%.2f", media));



        sc.close();
    }
}
