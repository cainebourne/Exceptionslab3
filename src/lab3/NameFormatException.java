package lab3;

/**
 *
 * @author cainebourne
 */
public class NameFormatException extends IllegalArgumentException {
    private static String errMsg = "You did not provide a legal format for the Name";

    public NameFormatException() {
        super(errMsg);
    }

    public NameFormatException(String string) {
        super(errMsg);
    }

    public NameFormatException(String string, Throwable cause) {
        super(errMsg, cause);
    }

    public NameFormatException(Throwable cause) {
        super(errMsg, cause);
    }
    
    
}
