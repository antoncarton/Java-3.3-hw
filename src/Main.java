public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Аннуитетный платеж на срок кредита 1 год: ");
        System.out.println(service.calculate(1_000_000, 0.0999, 1));

        System.out.println();
        System.out.println("Аннуитетный платеж на срок кредита 2 года: ");
        System.out.println(service.calculate(1_000_000, 0.0999, 2));

        System.out.println();
        System.out.println("Аннуитетный платеж на срок кредита 3 года: ");
        System.out.println(service.calculate(1_000_000, 0.0999, 3));
    }
}