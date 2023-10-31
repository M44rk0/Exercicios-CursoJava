package CursoJava.EX17;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EXPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite o número de pagantes: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.println("Dados do pagante #" + i);
            System.out.println("Pessoa Física ou Jurídica? (f/j): ");
            char a = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Renda anual: ");
            Double anualIncome = sc.nextDouble();
            if(a == 'f'){
                System.out.println("Total de gastos com saúde: ");
                Double healthCosts = sc.nextDouble();
                pessoas.add(new PessoaPublica(name, anualIncome, healthCosts));
            }
            else if(a == 'j'){
                System.out.println("Número de funcionários: ");
                Integer numberOfEmployees = sc.nextInt();
                pessoas.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println("Impostos: ");
        double somaTotal = 0;
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getName() + ": $" + String.format("%.2f", pessoa.tax()));
            somaTotal += pessoa.tax();
        }

        System.out.println("Total de Impostos: $" + String.format("%.2f", somaTotal));


    }
}
