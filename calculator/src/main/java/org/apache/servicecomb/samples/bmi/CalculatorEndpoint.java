package org.apache.servicecomb.samples.bmi;

public interface CalculatorEndpoint {
    /**
     * Calculate the BMI(Body Mass Index).
     */
    BMIViewObject calculate(double height, double weight);
}
