package quantitymesurement;

public class Length {

    public IUnit unit;

    public final double value;

    public Length(IUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) throws QuantityMesurementException {
        if( this.unit.getClass() == that.unit.getClass() )
            throw new QuantityMesurementException("Class not match", QuantityMesurementException.ExceptionType.NO_SUCH_CLASS);
        double firstValue = this.unit.getConvertedValue(this.value);
        double secondValue = that.unit.getConvertedValue(that.value);
        return Double.compare(firstValue, secondValue) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    public double add(Length that) throws QuantityMesurementException {
        if(this.unit.getClass() == that.unit.getClass())
            throw new QuantityMesurementException("Class not match", QuantityMesurementException.ExceptionType.NO_SUCH_CLASS);
        if ((this.unit == UnitForTemperature.FAHRENHEIT && that.unit == UnitForTemperature.CELSIUS) || (this.unit == UnitForTemperature.CELSIUS && that.unit == UnitForTemperature.FAHRENHEIT))
            throw new QuantityMesurementException("Method does not exist", QuantityMesurementException.ExceptionType.NO_SUCH_METHOD);
        double firstValue = this.unit.getConvertedValue(this.value);
        double secondValue = that.unit.getConvertedValue(that.value);
        return firstValue + secondValue;
    }

}

