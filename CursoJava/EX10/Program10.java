package CursoJava.EX10;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?: ");
        int i, j = 1, n = sc.nextInt();
        double menores = 0;
        double soma = 0;

        Pessoas[] vectpessoas = new Pessoas[n];

        for(i = 0; i < vectpessoas.length; i++){
            System.out.printf("Dados da %da pessoa: ", j);
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            if(idade < 16){
                menores++;
            }
            double altura = sc.nextDouble();
            vectpessoas[i] = new Pessoas(nome, idade, altura);
            soma += altura;
            j++;
        }

        double media = soma / vectpessoas.length;
        double porcentagem = (menores / vectpessoas.length) * 100;

        System.out.printf("Altura média: %.2f\n", media);
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", porcentagem) + "%");
        for (i = 0; i < vectpessoas.length; i++){
            if(vectpessoas[i].getIdade() < 16){
                System.out.println(vectpessoas[i].getNome());
            }
        }


    }
}
