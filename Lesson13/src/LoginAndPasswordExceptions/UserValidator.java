package LoginAndPasswordExceptions;

import java.util.Scanner;

public class UserValidator {

    static boolean validate(String login, String password, String passwordConfirm) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains("\s")) {
            throw new WrongLoginException("Wrong login format");
        } else if (password.length() >= 20 || password.contains("\s")) {
            throw new WrongPasswordException("Wrong password format");
        } else if (!password.equals(passwordConfirm)) {
            throw new WrongPasswordException("Passwords don't match");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login, password, confirmPassword = "";
        System.out.println("Enter your login:");
        login = scanner.nextLine();
        System.out.println("Enter your password:");
        password = scanner.nextLine();
        System.out.println("Confirm your password:");
        confirmPassword = scanner.nextLine();
        try {
            validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e1) {
            System.out.println(e1.getMessage());
        }

    }
}
