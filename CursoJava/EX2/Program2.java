package CursoJava.EX2;
import java.util.Scanner;
import java.util.Locale;

public class Program2 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Product Data:");
        System.out.println("Name: ");
        String Name = sc.nextLine();
        System.out.println("Quantity: ");
        int Quantity = sc.nextInt();
        System.out.println("Price: ");
        double Price = sc.nextDouble();

        Product product = new Product(Name, Quantity, Price);

        System.out.println("PRODUCT DATA:");
        product.Data();
        System.out.printf("Total: %.2f\n", product.TotalValueInStock());
        System.out.println("Enter the numbers of Products to enter the stock: ");
        int add = sc.nextInt();
        product.AddProducts(add);
        System.out.println("UPDATED DATA:");
        product.Data();
        System.out.printf("Total: %.2f\n", product.TotalValueInStock());
        System.out.println("Enter the numbers of Products to leave the stock: ");
        int leave = sc.nextInt();
        product.RemoveProducts(leave);
        System.out.println("UPDATED DATA:");
        product.Data();
        System.out.printf("Total: %.2f\n", product.TotalValueInStock());

        sc.close();
    }
}
