package CursoJava.EX22;

import CursoJava.EX21.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class EXSaque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("---Digite os dados da conta---");
            System.out.print("Número: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String holder = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double balance = sc.nextDouble();
            System.out.print("Limite de saque: ");
            Double withdrawLimit = sc.nextDouble();
            Conta conta = new Conta(number, holder, balance, withdrawLimit);
            System.out.println();
            System.out.print("Digite o valor para saque: ");
            Double amount = sc.nextDouble();
            conta.withdraw(amount);
            System.out.print("Novo saldo: R$" + balance);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
    }
}
