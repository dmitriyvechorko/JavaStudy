public class Calculator {
    double weight = 2.6;
    double cost = 3.4;
    String color = "Purple";

    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    {
        System.out.println(weight);
        System.out.println(cost);
        System.out.println(color);
    }
    public double sum(double a, double b) {
        return a + b;
    }
    public double difference(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divisionWithoutRemainder(double a, double b) {
        return a / b;
    }
    public double remainderOfDivision(double a, double b) {
        return a % b;
    }
}
