package quantitymesurement;

public enum Unit {

    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4), GALLON(3.78), LITER(1.0), ML(.001), KG(1000), GRAM(1), TONE(1000000), Celsius(2.12), Fahrenheit(1.0);

    private double value;

    Unit(double value) {
        this.value = value;
    }

    public boolean compare(Length length1, Length length2) {
        return Double.compare(length1.unit.value*length1.value, length2.unit.value*length2.value)==0;
    }

    public double getValueInInch(double value) {
        return value*this.value;
    }

    public double add(Length length1, Length length2) {
        return length1.unit.value*length1.value + length2.unit.value*length2.value;
    }
}
