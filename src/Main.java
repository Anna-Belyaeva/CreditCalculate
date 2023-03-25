public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

      //  int credit, int percent, int term

        System.out.println("Сумма кредита: 1 000 000. Процентная ставка: 9,99% ");
        System.out.println("Ежемесячный платёж при сроке ");

        System.out.println( " 1 год - " + service.calculate(1_000_000, 9.99, 12) + ";");
        System.out.println( " 2 года - " + service.calculate(1_000_000, 9.99, 24) + ";");
        System.out.println( " 3 года - " + service.calculate(1_000_000, 9.99, 36) + ";");



    }
}