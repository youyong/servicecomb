package org.apache.servicecomb.samples.bmi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BMIViewObject {

    private double result;

    private String instanceId;

    private String callTime;

    public BMIViewObject(double result, String instanceId, Date now) {
        this.result = result;
        this.instanceId = instanceId;
        this.callTime = new SimpleDateFormat("HH:mm:ss").format(now);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getCallTime() {
        return callTime;
    }

    public void setCallTime(String callTime) {
        this.callTime = callTime;
    }
}