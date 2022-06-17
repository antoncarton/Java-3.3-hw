public class CreditPaymentService {

    public double calculate(double creditSum, double interest, double years) {
        double k1;
        double k2;
        double monthlyInterest;
        monthlyInterest = interest / 12;
        double months;
        months = years * 12;
        k1 = 1 + monthlyInterest;
        k2 = Math.pow(k1, months);
        double payment;
        payment = creditSum * (monthlyInterest * k2 / (k2 - 1));
        return payment;
    }
}
