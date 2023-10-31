package CursoJava.EX21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        if(checkout.before(checkin)){
            throw new DomainException("a data de checkout deve ser depois da data de checkin");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckout() {
        return checkout;
    }

    public Long duration(){
        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)){
            throw new DomainException("As datas da reserva devem ser futuras");
        }
        if(checkout.before(checkin)){
            throw new DomainException("a data de checkout deve ser depois da data de checkin");
        }

        this.checkin = checkin;
        this.checkout = checkout;

    }

    @Override
    public String toString() {
        return "Quarto "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkin)
                + ", check-out: "
                + sdf.format(checkout)
                + ", "
                + duration()
                + " noites";
    }
}
