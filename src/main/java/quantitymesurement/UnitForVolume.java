package quantitymesurement;

public enum UnitForVolume implements IUnit {
    GALLON(3.78), LITER(1.0), ML(.001);

    public double value;

    UnitForVolume(double value) {
        this.value = value;
    }

    @Override
    public double getConvertedValue(double value) {
        return this.value*value;
    }

}
