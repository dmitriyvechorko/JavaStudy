public class Main {
    public static void main(String[] args) {
        //Calculator calculate = new Calculator(2.5, 156.87, "Blue");
        Calculator calculate = new Calculator();
        System.out.println(calculate.color);
        System.out.println(calculate.weight);
        System.out.println(calculate.cost);
        System.out.println(calculate.weight + " " + calculate.cost  + " " + calculate.color);
        System.out.println(calculate.sum(4.6, 65));
        System.out.println(calculate.difference(45, 8.1));
        System.out.println(calculate.multiply(4.3, 1.2));
        System.out.println(calculate.divisionWithoutRemainder(26.4, 7));
        System.out.println(calculate.remainderOfDivision(34, 10.6));
    }
}