package Login;

public class AutorizationException extends Exception {
    public AutorizationException() {
        super();
    }

    public AutorizationException(String message) {
        super(message);
    }

    public AutorizationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizationException(Throwable cause) {
        super(cause);
    }
}
