package CursoJava.EX3;
import EX3.Empregado;
import java.util.Scanner;
import java.util.Locale;

public class Program3 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EX3.Empregado funcionario = new Empregado();
        funcionario.Name = sc.nextLine();
        funcionario.GrossSalary = sc.nextDouble();
        funcionario.Tax = sc.nextDouble();

        System.out.println("Employee: " + funcionario);
        System.out.println("Which percentage to increase salary?: ");
        double perc = sc.nextDouble();

        funcionario.IncreaseSalary(perc);
        System.out.println("Updated data: " + funcionario);

        sc.close();
    }

}
