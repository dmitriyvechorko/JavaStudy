package HWTasks.AnimalsCollection;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<Animal> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(Animal animal) {
        animals.addFirst(animal);
    }

    public Animal removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста");
            return null;
        }
        return animals.removeLast();
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            System.out.println("Текущие животные: " + animals);
        }
    }
}

