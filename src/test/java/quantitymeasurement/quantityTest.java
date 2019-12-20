package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymesurement.*;

public class quantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length feet2 = new Length(UnitForLength.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnTrue(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        boolean checkCompare = feet1.compare(feet1);
        Assert.assertTrue(checkCompare);
    }

    @Test
    public void given0Feetand0Feet_WhenCompare_ShouldReturnTrue(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length feet2 = new Length(UnitForLength.FEET,0.0);
        boolean checkCompare = feet1.compare(feet2);
        Assert.assertTrue(checkCompare);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length feet2 = new Length(UnitForLength.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_WhenCompare_ShouldReturnFalse(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length feet2 = new Length(UnitForLength.FEET,1.0);
        boolean checkCompare = feet1.compare(feet2);
        Assert.assertFalse(checkCompare);
    }

    @Test
    public void given0Feetand1Feet_WhenEquals_ShouldReturnFalse(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length feet2 = new Length(UnitForLength.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Length inch1 = new Length(UnitForLength.INCH,0.0);
        Length inch2 = new Length(UnitForLength.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand0Inch_WhenCompare_ShouldReturnEqual(){
        Length inch1 = new Length(UnitForLength.INCH,0.0);
        Length inch2 = new Length(UnitForLength.INCH,0.0);
        boolean checkCompare = inch1.compare(inch2);
        Assert.assertTrue(checkCompare);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        Length inch1 = new Length(UnitForLength.INCH,0.0);
        Length inch2 = new Length(UnitForLength.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given0Inchand1Inch_WhenCompare_ShouldReturnNotEqual(){
        Length inch1 = new Length(UnitForLength.INCH,0.0);
        Length inch2 = new Length(UnitForLength.INCH,1.0);
        boolean checkCompare = inch1.compare(inch2);
        Assert.assertFalse(checkCompare);
    }

    @Test
    public void given0Feet0Inch_ShouldReturnTrueValue() {
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length inch1 = new Length(UnitForLength.INCH,0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feet12Inch_ShouldReturnTrueValue() {
        Length feet1 = new Length(UnitForLength.FEET,1.0);
        Length inch1 = new Length(UnitForLength.INCH,12.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feet1Inch_ShouldReturnFalseValue() {
        Length feet1 = new Length(UnitForLength.FEET,1.0);
        Length inch1 = new Length(UnitForLength.INCH,1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAndNull_ShouldReturnFalseValue() {
        Length feet1 = new Length(UnitForLength.FEET, 1.0);
        Length feet2 = null;
        boolean compareCheck = feet1.equals(feet2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ShouldReturnFalseValue() {
        Length inch = new Length(UnitForLength.INCH, 1.0);
        Length feet = new Length(UnitForLength.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given12InchAnd1Fit_ShouldReturnTrueValue() {
        Length inch = new Length(UnitForLength.INCH, 12.0);
        Length feet = new Length(UnitForLength.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ShouldReturnTrueValue() {
        Length feet = new Length(UnitForLength.FEET, 3.0);
        Length yard = new Length(UnitForLength.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ShouldReturnFalseValue() {
        Length feet = new Length(UnitForLength.FEET, 1.0);
        Length yard = new Length(UnitForLength.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ShouldReturnFalseValue() {
        Length inch = new Length(UnitForLength.INCH, 1.0);
        Length yard = new Length(UnitForLength.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ShouldReturnTrueValue() {
        Length yard = new Length(UnitForLength.YARD, 1.0);
        Length inch = new Length(UnitForLength.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ShouldReturnTrueValue() {
        Length inch = new Length(UnitForLength.INCH, 36.0);
        Length yard = new Length(UnitForLength.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ShouldReturnTrueValue() {
        Length yard = new Length(UnitForLength.YARD, 1.0);
        Length feet = new Length(UnitForLength.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5CM_ShouldReturnTrue() {
        Length inch = new Length(UnitForLength.INCH, 2.0);
        Length cm = new Length(UnitForLength.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        try {
            Length inch1 = new Length(UnitForLength.INCH, 2.0);
            Length inch2 = new Length(UnitForLength.INCH, 2.0);
            double result = inch1.add(inch2);
            Assert.assertEquals(4.0, result, 0.01);
        } catch (QuantityMesurementException e) { }
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inch() {
        try {
            Length feet = new Length(UnitForLength.FEET, 1.0);
            Length inch = new Length(UnitForLength.INCH, 2.0);
            double result = feet.add(inch);
            Assert.assertEquals(14.0, result, 0.01);
        } catch (QuantityMesurementException e) { }
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inch() {
        try {
            Length feet1 = new Length(UnitForLength.FEET, 1.0);
            Length feet2 = new Length(UnitForLength.FEET, 1.0);
            double result = feet1.add(feet2);
            Assert.assertEquals(24.0, result, 0.01);
        } catch (QuantityMesurementException e) { }
    }

    @Test
    public void givenTwoInchAndTwoAndHalfCM_ShouldReturn3Inch() {
        try {
            Length inch = new Length(UnitForLength.INCH, 2);
            Length cm = new Length(UnitForLength.CM, 2.5);
            double result = inch.add(cm);
            Assert.assertEquals(3.0, result, 0.01);
        } catch (QuantityMesurementException e) { }
    }

    @Test
    public void given1GallonAnd3Liters_ShouldReturnTrueValue(){
        Length gallon = new Length(UnitForVolume.GALLON, 1.0);
        Length litres = new Length(UnitForVolume.LITER, 3.78);
        boolean result = gallon.compare(litres);
        Assert.assertTrue(result);
    }

    @Test
    public void given1LiterAnd1000Ml_ShouldReturnTrueValue() {
        Length liter = new Length(UnitForVolume.LITER, 1.0);
        Length ml = new Length(UnitForVolume.ML, 1000);
        boolean result = liter.compare(ml);
        Assert.assertTrue(result);
    }

    @Test
    public void given1KGAnd1000GRAMS_ShouldReturnTrueValue() {
        Length kg = new Length(UnitForMass.KG,1.0);
        Length gram = new Length(UnitForMass.GRAM, 1000.0);
        boolean result = kg.compare(gram);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Kg_ShouldReturnTrueValue() {
        Length tonne = new Length(UnitForMass.TONE, 1.0);
        Length kg = new Length(UnitForMass.KG, 1000.0);
        boolean result = tonne.compare(kg);
        Assert.assertTrue(result);
    }

    @Test
    public void given1TonneAnd1000Gram_ShouldReturn1001000Gram() {
        try{
            Length tonne = new Length(UnitForMass.KG, 1.0);
            Length gram = new Length(UnitForMass.GRAM, 10);
            double result = tonne.add(gram);
            Assert.assertEquals(1010, result, 0.01);
        } catch(QuantityMesurementException e) {

        }
    }

    @Test
    public void given100CAnd212F_ShouldReturnEquals() {
        Length fahrenheit = new Length(UnitForTemperature.CELSIUS, 1.0);
        Length celsius = new Length(UnitForTemperature.FAHRENHEIT, 33.8);
        boolean result = fahrenheit.compare(celsius);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FAnd1C_ShouldReturnException() {
        try {
            Length fahrenheit = new Length(UnitForTemperature.FAHRENHEIT, 1.0);
            Length celsius = new Length(UnitForTemperature.CELSIUS, 1.0);
            double result = fahrenheit.add(celsius);
        } catch (QuantityMesurementException e) {
            Assert.assertEquals(QuantityMesurementException.ExceptionType.NO_SUCH_METHOD, e.exceptionType);
        }
    }

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEqual(){
        Length feet1 = new Length(UnitForLength.FEET,0.0);
        Length feet2 = new Length(UnitForLength.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void test() {
        Length feet = new Length(UnitForLength.FEET, 3.0);
        Length inch = new Length(UnitForLength.INCH, 36.0);
        boolean result = feet.compare(inch);
        Assert.assertTrue(result);
    }

}

//    @Test
//    public void given212FAnd100C_ShouldReturnEquals() {
//        Length fahrenheit = new Length(UnitForTemperature.FAHRENHEIT, 1);
//        Length celsius = new Length(UnitForTemperature.CELSIUS, -17.2222);
//        boolean result = fahrenheit.compare(celsius);
//        Assert.assertTrue(result);
//    }
