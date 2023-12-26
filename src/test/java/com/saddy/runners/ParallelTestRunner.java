package com.saddy.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class ParallelTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestRunner.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("All tests passed: " + result.wasSuccessful());
    }
}
