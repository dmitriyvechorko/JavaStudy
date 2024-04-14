package Animals;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger roars");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger likes to eat " + food);
        } else {
            System.out.println("Tiger doesn't like to eat " + food);
        }
    }
}
