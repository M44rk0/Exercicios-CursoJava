package CursoJava.EX21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EXReserva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    try {
        System.out.print("Número do quarto: ");
        int number = sc.nextInt();
        System.out.print("Data do Check-in: ");
        Date checkin = sdf.parse(sc.next());
        System.out.print("Data do Check-out: ");
        Date checkout = sdf.parse(sc.next());

        Reservation reserva = new Reservation(number, checkin, checkout);
        System.out.println("Reserva: " + reserva);

        System.out.println();
        System.out.println("Digite uma nova data para atualizar a reserva:");
        System.out.print("Data do Check-in: ");
        checkin = sdf.parse(sc.next());
        System.out.print("Data do Check-out: ");
        checkout = sdf.parse(sc.next());

        reserva.updateDates(checkin, checkout);
        System.out.println("Reserva: " + reserva);
    }
    catch (ParseException e){
        System.out.println("Formato de data inválida");
    }
    catch (DomainException e){
        System.out.println("Erro na reserva: " + e.getMessage());
    }
    catch (RuntimeException e){
        System.out.println("Erro inesperado");
        }


    }
}
