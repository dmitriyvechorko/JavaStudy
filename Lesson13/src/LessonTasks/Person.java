package LessonTasks;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws AgeBelow18Exception {
        if (age < 18) {
            throw new AgeBelow18Exception("Person's age must be 18 or older.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}