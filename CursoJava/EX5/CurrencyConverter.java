package CursoJava.EX5;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double Dollar(double price, double quantity){
        return quantity * ((price * IOF) + price);
    }

}
