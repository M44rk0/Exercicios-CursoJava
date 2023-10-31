package CursoJava.EX5;
import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price?: ");
        double price = sc.nextDouble();
        System.out.println("How many dollar will be bought?: ");
        double quantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais: " + String.format("%.2f\n", CurrencyConverter.Dollar(price, quantity)));

        sc.close();
    }
}
