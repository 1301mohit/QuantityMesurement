package quantitymesurement;

public enum UnitForLength implements IUnit {

    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4);

    public double value;

    UnitForLength(double value) {
        this.value = value;
    }

    @Override
    public double getConvertedValue(double value) {
        return this.value*value;
    }

}


//    @Override
//    public boolean compare(IUnit unit1) {
//       // return Double.compare(length1.unit1.value*length1.value, length2.unit1.value*length2.value)==0;
//        return Double.compare()
//    }