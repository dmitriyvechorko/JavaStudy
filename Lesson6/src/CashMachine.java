public class CashMachine {
    int numOf20;
    int numOf50;
    int numOf100;

    public CashMachine(int numOf20, int numOf50, int numOf100) {
        this.numOf20 = numOf20;
        this.numOf50 = numOf50;
        this.numOf100 = numOf100;
    }

    public void addMoney(int numOf20, int numOf50, int numOf100) {
        this.numOf20 += numOf20;
        this.numOf50 += numOf50;
        this.numOf100 += numOf100;
    }

    public void showInfo() {
        System.out.println("\nСумма купюр: " + (numOf20 * 20 + numOf50 * 50 + numOf100 * 100));
        System.out.println("купюр номиналом 20: " + numOf20);
        System.out.println("Купюр номиналом 50: " + numOf50);
        System.out.println("Купюр номиналом 100: " + numOf100 + "\n");
    }

    public boolean withdrawMoney(int amount) {        //Скорее всего есть более оптимальный варик,
        int remainingAmount = amount;                 //но я к сожалению не смог его найти

        int numOf100Needed = Math.min(remainingAmount / 100, numOf100);
        remainingAmount -= numOf100Needed * 100;

        int numOf50Needed = Math.min(remainingAmount / 50, numOf50);
        remainingAmount -= numOf50Needed * 50;

        int numOf20Needed = Math.min(remainingAmount / 20, numOf20);
        remainingAmount -= numOf20Needed * 20;

        if (remainingAmount != 0) {
            remainingAmount = amount;

            numOf100Needed = Math.min(remainingAmount / 100, numOf100);
            remainingAmount -= numOf100Needed * 100;

            numOf20Needed = Math.min(remainingAmount / 20, numOf20);
            remainingAmount -= numOf20Needed * 20;

            numOf50Needed = Math.min(remainingAmount / 50, numOf50);
            remainingAmount -= numOf50Needed * 50;
        }

        if (remainingAmount != 0) {
            remainingAmount = amount;

            numOf20Needed = Math.min(remainingAmount / 20, numOf20);
            remainingAmount -= numOf20Needed * 20;

            numOf50Needed = Math.min(remainingAmount / 50, numOf50);
            remainingAmount -= numOf50Needed * 50;

            numOf100Needed = Math.min(remainingAmount / 100, numOf100);
            remainingAmount -= numOf100Needed * 100;
        }

        if (remainingAmount != 0) {
            remainingAmount = amount;

            numOf50Needed = Math.min(remainingAmount / 50, numOf50);
            remainingAmount -= numOf50Needed * 50;

            numOf20Needed = Math.min(remainingAmount / 20, numOf20);
            remainingAmount -= numOf20Needed * 20;

            numOf100Needed = Math.min(remainingAmount / 100, numOf100);
            remainingAmount -= numOf100Needed * 100;
        }

        if (remainingAmount != 0) {
            remainingAmount = amount;

            numOf20Needed = Math.min(remainingAmount / 20, numOf20);
            remainingAmount -= numOf20Needed * 20;

            numOf100Needed = Math.min(remainingAmount / 100, numOf100);
            remainingAmount -= numOf100Needed * 100;

            numOf50Needed = Math.min(remainingAmount / 50, numOf50);
            remainingAmount -= numOf50Needed * 50;
        }

        if (remainingAmount != 0) {
            remainingAmount = amount;

            numOf50Needed = Math.min(remainingAmount / 50, numOf50);
            remainingAmount -= numOf50Needed * 50;

            numOf100Needed = Math.min(remainingAmount / 100, numOf100);
            remainingAmount -= numOf100Needed * 100;

            numOf20Needed = Math.min(remainingAmount / 20, numOf20);
            remainingAmount -= numOf20Needed * 20;
        }

        if (remainingAmount != 0) {
            return false;
        }

        numOf20 -= numOf20Needed;
        numOf50 -= numOf50Needed;
        numOf100 -= numOf100Needed;

        System.out.println("Сумма " + amount + " была снята из банкомата:");
        System.out.println("купюр номиналом 20: " + numOf20Needed);
        System.out.println("Купюр номиналом 50: " + numOf50Needed);
        System.out.println("Купюр номиналом 100: " + numOf100Needed);

        return true;
    }
}
