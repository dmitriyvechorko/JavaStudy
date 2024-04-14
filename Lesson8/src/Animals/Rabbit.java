package Animals;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Rabbit snorts");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit likes to eat " + food);
        } else {
            System.out.println("Rabbit doesn't like to eat " + food);
        }
    }
}
