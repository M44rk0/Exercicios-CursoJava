package CursoJava.EX11;
import java.util.Locale;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] rent = new Aluguel[10];
        int j = 1;

        System.out.println("Quantos quartos serão alugados?: ");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.printf("Aluguel: #%d\n", j);
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto: ");
            int aux = sc.nextInt();
            sc.nextLine();
            rent[aux] = new Aluguel(name, email);
            j++;
        }

        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

    }
}
