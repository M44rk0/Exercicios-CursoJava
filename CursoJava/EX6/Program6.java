package CursoJava.EX6;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Is there any initial deposit (y/n)?");
        char answer = sc.next().charAt(0);
        double balance = 0;

        if(answer == 'y'){
            System.out.println("Enter initial deposit value: ");
            balance += sc.nextDouble();
        }

        BankAccount account = new BankAccount(name, number, balance);

        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.Deposit(deposit);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.Withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.println(account);


        sc.close();
    }
}
