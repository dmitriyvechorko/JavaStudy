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
        
        List<String> filteredNames = data.entrySet().stream()
                .filter(entry -> Arrays.asList(1, 2, 5, 8, 9, 13).contains(entry.getKey())) // filtering List by id
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0) // filtering by odd number of letters in name
                .map(FilteringMapUsingStream::reverseString) // reverse names
                .toList();
        System.out.println(filteredNames);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
