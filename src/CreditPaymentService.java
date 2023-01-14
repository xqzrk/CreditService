public class CreditPaymentService {
    public double calculate(int credit, double percent, int months) {
        double value = 1 + (percent / 12 / 100);
        double powValue = months;
        double work = Math.pow(value, powValue);
        double payment = credit * ((percent / 12 / 100) * work) / (work - 1);
        return payment;
    }
}
