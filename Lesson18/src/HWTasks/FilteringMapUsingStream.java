package HWTasks;

import java.util.*;

public class FilteringMapUsingStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> data = new HashMap<>();
        while (true) {
            System.out.println("Enter ID (integer) or enter '0' to exit: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if (id == 0) {
                break;
            }
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            data.put(id, name);
        }

        // Filtering map depending on conditions
        List<String> selectedNames = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            if (isValidId(id) && hasOddNumberOfLetters(name)) {
                selectedNames.add(reverseName(name));
            }
        }

        System.out.println("Names backwards: ");
        for (String name : selectedNames) {
            System.out.println(name);
        }
    }

    // Checking id
    private static boolean isValidId(int id) {
        return id == 1 || id == 2 || id == 5 || id == 8 || id == 9 || id == 13;
    }

    // Checking string on  odd number of letters
    private static boolean hasOddNumberOfLetters(String str) {
        return str.length() % 2 != 0;
    }

    // Reversing the string
    private static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
