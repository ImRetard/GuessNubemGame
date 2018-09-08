package Login;

public class PersonalDataException extends Exception {
    public PersonalDataException() {
        super();
    }

    public PersonalDataException(String message) {
        super(message);
    }

    public PersonalDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonalDataException(Throwable cause) {
        super(cause);
    }
}
