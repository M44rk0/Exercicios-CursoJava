package CursoJava.EX16;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EXPagamento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Digite o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("dados do Empregado #" + i + "\n");
            System.out.println("Terceirizado? (y/n): ");
            char a = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Horas: ");
            Integer hours = sc.nextInt();
            System.out.println("Valor por Hora: ");
            Double valuePerHour = sc.nextDouble();
            if(a == 'y'){
                System.out.println("Cobrança adicional: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("Pagamentos: ");
        for (Employee employee : employees) {
            System.out.printf(employee.getName() + " $ " + employee.payment() + "\n");
        }

    }
}
