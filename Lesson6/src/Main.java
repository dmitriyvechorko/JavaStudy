public class Main {

    //public static void main(String[] args) {
    //    Person sergey = new Person();
    //    Person dmitry = new Person("Dmitry", 19);
    //
    //    sergey.talk("Hi!");
    //    sergey.move();
    //    dmitry.talk("Hi!");
    //    dmitry.move();
    //}

    //public static void main(String[] args) {
    //    CreditCard bobAccount = new CreditCard(13403450, 294.65);
    //    CreditCard nickAccount = new CreditCard(54762389, 865.92);
    //    CreditCard johnAccount = new CreditCard(73232403, 456.25);
    //    bobAccount.topUpCard(56.64);
    //    nickAccount.topUpCard(11.11);
    //    johnAccount.withdrawMoney(500.);
    //    bobAccount.viewAccountInfo();
    //    nickAccount.viewAccountInfo();
    //    johnAccount.viewAccountInfo();
    //}

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(5, 1, 1);

        cashMachine.showInfo();

        int amountToWithdraw = 110;
        boolean success = cashMachine.withdrawMoney(amountToWithdraw);
        if (success) {
            System.out.println("Операция снятия денег прошла успешно.");
        } else {
            System.out.println("Операция снятия денег не удалась.");
        }

        System.out.println("\nПосле снятия:");
        cashMachine.showInfo();
    }
}