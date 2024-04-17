package User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("diamond", "diamond@example.com", "pass04");
        User user2 = new User("diamond", "diamond@example.com", "pass04");

        System.out.println("User1: " + user1);
        System.out.println("User2: " + user2);

        System.out.println("User1.equals(User2): " + user1.equals(user2));

        System.out.println("User1 hashCode: " + user1.hashCode());
        System.out.println("User2 hashCode: " + user2.hashCode());
    }
}