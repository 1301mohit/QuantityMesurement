package quantitymesurement;

public class QuantityMesurementException extends Exception {

    public enum ExceptionType {
        NO_SUCH_METHOD;
    }

    public ExceptionType exceptionType;

    public QuantityMesurementException(String s, ExceptionType exceptionType) {
        super(s);
        this.exceptionType = exceptionType;
    }

}
