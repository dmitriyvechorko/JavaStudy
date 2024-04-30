package LoginAndPasswordExceptions;

public class WrongPasswordException extends Exception{
    WrongPasswordException() {
    }

    WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Wrong password exception";
    }
}
