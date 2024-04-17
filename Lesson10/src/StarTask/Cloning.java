package StarTask;

public class Cloning {
    public static User cloneUser(User user, String cloneType) {
        try {
            if (cloneType.equals("direct")) {
                return user.clone();
            } else if (cloneType.equals("deep")) {
                return user.deepClone();
            } else {
                throw new IllegalArgumentException("Некорректный тип клонирования. Используйте 'direct' или 'deep'.");
            }
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Address address = new Address("Street", "York", "12345");
        User originalUser = new User(31, "Alex", address);

        User directClone = cloneUser(originalUser, "direct");
        System.out.println("\nПоверхностное клонирование:");
        System.out.println("Оригинал: " + originalUser);
        System.out.println("Клон: " + directClone);

        User deepClone = cloneUser(originalUser, "deep");
        System.out.println("\nГлубокое клонирование:");
        System.out.println("Оригинал: " + originalUser);
        System.out.println("Клон: " + deepClone);
    }
}
