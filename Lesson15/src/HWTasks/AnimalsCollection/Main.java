package HWTasks.AnimalsCollection;

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();
        animalCollection.displayAnimals();

        Animal lynx = new Animal("Lynx");
        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog");

        animalCollection.addAnimal(lynx);
        animalCollection.addAnimal(cat);
        animalCollection.addAnimal(dog);
        animalCollection.displayAnimals();

        Animal removedAnimal = animalCollection.removeAnimal();
        System.out.println("Removed: " + removedAnimal);
        animalCollection.displayAnimals();
    }
}
