package TestNGDemos.ForListners;

import TestNGDemos.sites.util.Initialize;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import lombok.SneakyThrows;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static TestNGDemos.ForListners.listnerUtil.ListnerInit.initExtent;
import static TestNGDemos.ForListners.listnerUtil.ListnerInit.takescreenshotLisners;

public class MyListnerExtentReports extends Initialize implements ITestListener {

    ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        System.out.println("==========> onTestStart");
        test = extent.createTest(result.getMethod().getMethodName());


    }

    public  void onTestSuccess(ITestResult result) {
        System.out.println("==========> onTestSuccess");

        test.pass(result.getMethod().getMethodName()+"This test is passed");
    }


    public  void onTestFailure(ITestResult result) {

        System.out.println("==========> onTestFailure");
        test.info(result.getMethod().getMethodName()+"This test is failed");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshotLisners(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void onTestSkipped(ITestResult result) {

        System.out.println("==========> onTestSkipped");
        test.skip(result.getMethod().getMethodName()+"This test is skipped");

    }

    public  void onStart(ITestContext context) {

        System.out.println("==========> onStart");

        if(extent==null)
         extent = initExtent();

    }

    public  void onFinish(ITestContext context) {

        System.out.println("==========> onFinish");
        extent.flush();

    }
}
