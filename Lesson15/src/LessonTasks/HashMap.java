package LessonTasks;

import java.util.HashSet;



public class HashMap {
    public static void main(String[] args) {
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Ivan"));
        personSet.add(new Person("Dima"));
        personSet.add(new Person("Sergey"));
        System.out.println("HashSet elements:");
        for (Person person : personSet) {
            System.out.println(person.getName());
        }
        Person personToRemove1 = new Person("Dima");
        Person personToRemove2 = new Person("Sergey");
        personSet.remove(personToRemove1);
        personSet.remove(personToRemove2);
        System.out.println("HashSet elements:");
        for (Person person : personSet) {
            System.out.println(person.getName());
        }
        Person personToCheck = new Person("Ivan");
        if (personSet.contains(personToCheck)) {
            System.out.println(personToCheck.getName() + " HashSet.");
        } else {
            System.out.println(personToCheck.getName() + " isn't contained in HashSet.");
        }
    }
}

