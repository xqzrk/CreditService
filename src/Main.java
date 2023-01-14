public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int months = 12;
        double percent = 9.99;
        int credit = 1_000_000;
        double payment = service.calculate(credit, percent, months);
        System.out.printf("Ежемесячный платеж - %.0f р. ", payment);
    }
}