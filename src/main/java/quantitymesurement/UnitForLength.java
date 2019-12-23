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