package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymesurement.Unit;

public class EnumTest {

    @Test
    public void given1Feet_ShouldReturn12Inch() {
        double value = Unit.FEET.getValueInInch(1.0);
        Assert.assertEquals(12.0, value, 0.01);
    }

    @Test
    public void given5Feet_ShouldReturn60Inch() {
        double value = Unit.FEET.getValueInInch(5.0);
        Assert.assertEquals(60.0, value, 0.01);
    }

    @Test
    public void given2Inch_ShouldReturn2Inch() {
        double value = Unit.INCH.getValueInInch(2.0);
        Assert.assertEquals(2.0, value, 0.01);
    }

    @Test
    public void given1Yard_ShouldReturn36Inch() {
        double value = Unit.YARD.getValueInInch(1.0);
        Assert.assertEquals(36.0, value, 0.01);
    }

    @Test
    public void given1Celsius_ShouldReturnInFahrenheit() {
        double value = Unit.CELSIUS.getValueInFahrenheit(1.0);
        Assert.assertEquals(33.8, value, 0.01);
    }

    @Test
    public void given1Gallon_ShouldReturnInLiter() {
        double value = Unit.GALLON.getValueInLiter(1.0);
        Assert.assertEquals(3.78, value, 0.01);
    }

    @Test
    public void given1Kg_ShouldReturn1000Gram() {
        double value = Unit.KG.getValueInGram(1.0);
        Assert.assertEquals(1000, value, 0.01);
    }

    @Test
    public void given1Tonne_ShouldReturn1000000Gram() {
        double value = Unit.TONE.getValueInGram(1.0);
        Assert.assertEquals(1000000, value, 0.01);
    }
}
