package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymesurement.Length;
import quantitymesurement.Unit;

public class quantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_WhenCompare_ShouldReturnEqual(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        boolean checkCompare = feet1.compare(feet2);
        Assert.assertTrue(checkCompare);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_WhenCompare_ShouldReturnFalse(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean checkCompare = feet1.compare(feet2);
        Assert.assertFalse(checkCompare);
    }

    @Test
    public void given0Feetand1Feet_WhenEquals_ShouldReturnFalse(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_WhenCompare_ShouldReturnEqual(){
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        boolean checkCompare = inch1.compare(inch2);
        Assert.assertTrue(checkCompare);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_WhenCompare_ShouldReturnNotEqual(){
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        boolean checkCompare = inch1.compare(inch2);
        Assert.assertFalse(checkCompare);
    }

    @Test
    public void given0Feet0Inch_ShouldReturnTrueValue() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length inch1 = new Length(Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feet12Inch_ShouldReturnTrueValue() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feet1Inch_ShouldReturnFalseValue() {
        Length feet1 = new Length(Unit.FEET,1.0);
        Length inch1 = new Length(Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

}
