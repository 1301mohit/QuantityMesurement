package quantitymesurement;

public class CompareTwoFeetValue extends CompareTwoValues{

    public CompareTwoFeetValue() {

    }

    public CompareTwoFeetValue(Unit unit, double value) {
        super.unit = unit;
        super.value = value;
    }

    @Override
    public boolean compare() {
        return false;
    }

//    @Override
//    public boolean compare(Length that) {
//        if(Unit.FEET.equals())
//    }
//
//    @Override
//    public boolean compare() {
//        return false;
//    }
}
