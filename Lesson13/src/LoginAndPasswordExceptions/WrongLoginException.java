package LoginAndPasswordExceptions;

public class WrongLoginException extends Exception{
    WrongLoginException() {
    }

    WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Wrong login exception";
    }
}
