package LoginAndPasswordExceptions;

public class WrongPasswordException extends Exception {

    WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Wrong password exception";
    }
}
