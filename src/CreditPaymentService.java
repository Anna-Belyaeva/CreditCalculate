public class CreditPaymentService {

    public int calculate(int credit, double percent, int term){

        double interestRate = percent / (100*12);

        double paymentMoth = credit * ( interestRate / (1-Math.pow(1+interestRate, -term)));

        return (int) paymentMoth;

    }

}
