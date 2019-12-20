package quantitymesurement;

public enum UnitForTemperature implements IUnit{

    CELSIUS(33.8), FAHRENHEIT(1.0);

    public double value;

    UnitForTemperature(double value) {
        this.value = value;
    }

    @Override
    public double getConvertedValue(double value) {
        return this.value*value;
    }

}
