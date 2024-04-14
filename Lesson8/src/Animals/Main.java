package Animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = Dog.createDog();
        Animal myDog = Dog.getInstance();
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");

        myDog.voice();
        myDog.eat("Meat");
        myDog.eat("Grass");

        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");

        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
    }
}