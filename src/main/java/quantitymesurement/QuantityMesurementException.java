package quantitymesurement;

public class QuantityMesurementException extends Exception {

    public enum ExceptionType {
        NO_SUCH_METHOD, NO_SUCH_CLASS;
    }

    public ExceptionType exceptionType;

    public QuantityMesurementException(String s, ExceptionType exceptionType) {
        super(s);
        this.exceptionType = exceptionType;
    }

}
