package quantitymesurement;

public enum UnitForMass implements IUnit {

    KG(1000) , GRAM(1) , TONE(1000000);

    public double value;

    UnitForMass(double value) {
        this.value = value;
    }

    @Override
    public double getConvertedValue(double value) {
        return this.value*value;
    }

}
