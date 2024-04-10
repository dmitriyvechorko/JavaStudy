public class CreditCard {
    int accountNumber;
    double invoiceAmount;

    public double topUpCard(double value) {
        return invoiceAmount + value;
    }

    public double withdrawMoney(double value) {
        if (invoiceAmount >= value) {
            return invoiceAmount - value;
        } else {
            System.out.println("Not enough money on your account!");
            return 0;
        }
    }
}
