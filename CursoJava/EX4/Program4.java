package CursoJava.EX4;
import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();

        aluno.name = sc.nextLine();
        aluno.grade1 = sc.nextDouble();
        aluno.grade2 = sc.nextDouble();
        aluno.grade3 = sc.nextDouble();

        if (aluno.finalGrade() > 60){
            System.out.printf("FINAL GRADE: %.2f\n", aluno.finalGrade());
            System.out.println("PASS");
        }
        else{
            System.out.printf("FINAL GRADE: %.2f\n", aluno.finalGrade());
            System.out.println("FAILED");
            double missing = 60.00 - aluno.finalGrade();
            System.out.printf("MISSING %.2f POINTS", missing);

        sc.close();
        }



    }

}
