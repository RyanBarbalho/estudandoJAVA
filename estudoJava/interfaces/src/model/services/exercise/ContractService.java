package model.services.exercise;

import java.time.LocalDate;

import model.entities.excercise.Contract;
import model.entities.excercise.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        // basic quota = parcela basica
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dateDue = contract.getDate().plusMonths(i);// date of the contract + i months

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(interest + basicQuota);

            double fullQuota = interest + fee + basicQuota;

            contract.getInstallments().add(new Installment(dateDue, fullQuota));
        }

    }

}
