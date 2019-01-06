package org.apache.servicecomb.samples.bmi;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestSchema(schemaId = "calculatorRestEndpoint")
@RequestMapping("/")
public class CalculatorRestEndpoint implements  CalculatorEndpoint  {

    private final CalculatorService calculatorService;

    private final InstanceInfoService instanceInfoService;

    @Autowired
    public CalculatorRestEndpoint(CalculatorService calculatorService, InstanceInfoService instanceInfoService) {
        this.calculatorService = calculatorService;
        this.instanceInfoService = instanceInfoService;
    }

    @GetMapping(path = "/bmi")
    @Override
    public BMIViewObject calculate(double height, double weight) {

        String instanceId = instanceInfoService.getInstanceId();
        double bmiResult = calculatorService.calculate(height, weight);
        return new BMIViewObject(bmiResult, instanceId, new Date());
    }

    @GetMapping("hi")
    @Override
    public String hi(String name) {
        return "hi " + name;
    }
}
