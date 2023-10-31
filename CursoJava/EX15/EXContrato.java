package CursoJava.EX15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EXContrato {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento: ");
        String department = sc.nextLine();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.println("Nome: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Salário base: ");
        double workerSalary = sc.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(department));

        System.out.println("Quantos contratos?: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o contrato#" + i + ": ");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Valor por hora: ");
            double valor = sc.nextDouble();
            System.out.println("Quantidade de horas: ");
            int hora = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valor, hora);
            worker.addContract(contract);
        }

        System.out.println("Digite um mês e um ano para calcular o salário: ");
        String meseano = sc.next();
        int mes = Integer.parseInt(meseano.substring(0, 2));
        int ano = Integer.parseInt(meseano.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartament().getName());
        System.out.println("Salário de " + meseano + ": " + worker.income(ano, mes));

        sc.close();
    }
}
