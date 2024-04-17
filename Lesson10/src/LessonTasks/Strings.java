package LessonTasks;

public class Strings {
    public static void main(String[] args) {
        String line1 = "Hi";
        String line2 = " man";
        System.out.println(line1 + line2);
        System.out.println(line1.concat(line2));
        String line3 = "Hi";
        String line4 = "hi";
        System.out.println(line3.equals(line4));
        System.out.println(line3.equalsIgnoreCase(line4));
        String line5 = "What's up man";
        System.out.println(line5.substring(3));
        System.out.println(line5.length());
        System.out.println(line5.indexOf("a"));
        boolean t = true;
        String line6 = Boolean.toString(t);
        System.out.println(line6);
        System.out.println(line6.toUpperCase());
        String line7 = "Num 314";
        System.out.println(line7.replace("1", "%"));
        String line8 = "   Num 314   ";
        System.out.println(line8.trim());
        System.out.println(line7.isEmpty());
        String[] parts = line5.split(" ");
        for (String l: parts) {
            System.out.println(l);
        }

        System.out.println("Account".equals("Acсount")); //Always false as there are different characters
    }
}
