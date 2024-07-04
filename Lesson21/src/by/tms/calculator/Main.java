package by.tms.calculator;

import by.tms.calculator.web.WebApplication;

public class Main {

    public static void main(String[] args) {
        Application calculatorApplication = new WebApplication();
        calculatorApplication.run();
    }
}