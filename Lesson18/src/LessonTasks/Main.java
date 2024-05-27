package LessonTasks;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<User> user = Optional.ofNullable(getUser());
        String userName = user.map(User::getName).orElse("DEFAULT");
        System.out.println("User name: " + userName);
    }

    private static User getUser() {
        return null;
    }
}