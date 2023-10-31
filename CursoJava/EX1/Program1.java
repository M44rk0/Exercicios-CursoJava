package CursoJava.EX1;
import java.util.Locale;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();

        ret.Height = sc.nextDouble();
        ret.Width = sc.nextDouble();

        System.out.printf("Area: %.2f\n", ret.Area());
        System.out.printf("Perimetro: %.2f\n", ret.Perimetro());
        System.out.printf("Diagonal: %.2f\n ", ret.Diagonal());

        sc.close();
    }
}