package JavaProgram;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
    private int maxRetryCount = 3; // Maximum number of retry attempts

    @Override
    public boolean retry(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE && maxRetryCount > 0) {
            maxRetryCount--;
            return true; // Retry the test
        }
        return false; // Do not retry the test
    }
}