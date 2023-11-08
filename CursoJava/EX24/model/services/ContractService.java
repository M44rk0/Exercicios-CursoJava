package CursoJava.EX24.model.services;

import CursoJava.EX24.model.entities.Contract;
import CursoJava.EX24.model.entities.Installment;

import java.time.LocalDate;

public class ContractService{

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){

        double basicPay = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(basicPay, i);
            double fee = paymentService.paymentFee(basicPay + interest);
            double quota = basicPay + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));

        }
    }
}
