package CursoJava.EX12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcioarios seram lidos?: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Empregado #" + i + 1 + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            Double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));

        }

        System.out.println("Digite o ID do funcionario que terá o salário aumentado: ");
        int aumento = sc.nextInt();
        int pos = positionId(funcionarios, aumento);
        if (pos == -1) {
            System.out.println("Funcionário inexistente!");
            for (int i = 0; i < funcionarios.size(); i++) {
                System.out.println(funcionarios.get(i));
            }
        } else {
            System.out.println("Digite a porcentagem: ");
            int porcentagem = sc.nextInt();
            funcionarios.get(pos).salaryIncrease(porcentagem);

        }

        System.out.println("Lista de funcionários: ");

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }

    public static int positionId(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}

