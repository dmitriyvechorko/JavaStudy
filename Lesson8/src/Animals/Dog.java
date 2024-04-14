package Animals;

public class Dog extends Animal{
    private Dog() {
    }

    public static Dog createDog() {
        return new Dog();
    }

    @Override
    public void voice() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Dog likes to eat meat");
        } else {
            System.out.println("Dog doesn't like to eat " + food);
        }
    }
}
