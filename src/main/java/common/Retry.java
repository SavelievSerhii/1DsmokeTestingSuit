package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private int counter = 0;
    private static int maxQtyAttempts = 3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                        //Check if test not succeed
            if (counter < maxQtyAttempts) {                            //Check if maxQtyAttempts count is reached
                counter++;                                     //Increase the maxQtyAttempts count by 1
                iTestResult.setStatus(ITestResult.FAILURE);    //Mark test as failed
                return true;                                   //Tells TestNG to re-run the test
            } else {
                iTestResult.setStatus(ITestResult.FAILURE);    //If maxQtyAttempts value reached,test marked as failed
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);        //If test passes, TestNG marks it as passed
        }
        return false;
    }
}
