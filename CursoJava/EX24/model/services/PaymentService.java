package CursoJava.EX24.model.services;

public interface PaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
