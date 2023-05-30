package Exeptions;

public class UncorrectDataException extends RuntimeException {
    public UncorrectDataException (String msg) {
        super(msg);
    }
}
