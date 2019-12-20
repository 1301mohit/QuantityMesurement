package quantitymesurement;

public class Length {

    public IUnit unit;

    public final double value;

    public Length(IUnit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
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
        if ((this.unit != UnitForTemperature.FAHRENHEIT && that.unit != UnitForTemperature.CELSIUS) || (this.unit != UnitForTemperature.CELSIUS && that.unit != UnitForTemperature.FAHRENHEIT)) {
            double firstValue = this.unit.getConvertedValue(this.value);
            double secondValue = that.unit.getConvertedValue(that.value);
            return firstValue + secondValue;
        }
        throw new QuantityMesurementException("Method does not exist", QuantityMesurementException.ExceptionType.NO_SUCH_METHOD);
    }

}


//    public double add(Length that) throws QuantityMesurementException {
//        if((this.unit != Unit.FAHRENHEIT && that.unit != Unit.CELSIUS) || (this.unit != Unit.CELSIUS && that.unit != Unit.FAHRENHEIT))
//            return unit.add(this, that);
//        throw new QuantityMesurementException("Method does not exist", QuantityMesurementException.ExceptionType.NO_SUCH_METHOD);
//    }

