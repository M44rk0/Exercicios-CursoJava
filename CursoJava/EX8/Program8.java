package CursoJava.EX8;
import java.util.Locale;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double soma = 0;

        Products[] vect = new Products[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Products(name, price);
            soma += price;
        }

        double media = soma / vect.length;

        System.out.printf("Média: %.2f\n", media);


    }
}
