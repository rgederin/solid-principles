package com.gederin.solid.open;

public class HealthInsuranceSurveyor implements InsuranceSurveyor {

    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");

        /*Logic to validate health insurance claims*/

        return true;
    }
}
