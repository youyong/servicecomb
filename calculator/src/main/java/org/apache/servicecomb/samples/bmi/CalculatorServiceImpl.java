package org.apache.servicecomb.samples.bmi;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CalculatorServiceImpl implements  CalculatorService {
    @Override
    public double calculate(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Arguments must be above 0");
        }
        double heightInMeter = height / 100;
        double bmi = weight / (heightInMeter * heightInMeter);
        return roundToOnePrecision(bmi);
    }

    private double roundToOnePrecision(double value) {
        return new BigDecimal(value).setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}
