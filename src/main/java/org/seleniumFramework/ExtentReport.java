package org.seleniumFramework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import page.Page;

public class ExtentReport {

    public static ExtentReports extentReports;
    public static ExtentSparkReporter extentSparkReporter;
    public static ExtentTest extentTest;

    public static void setupReport(){
        extentReports=new ExtentReports();
        //TODO: dont hardcode urls & literals
        extentSparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\target\\extentReports\\test-report.html");
        extentReports.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setTimeStampFormat("EEEE,MMMM dd,yy,hh:mm a'('zzz')'");
        extentSparkReporter.config().setEncoding("UTF-8");
        extentSparkReporter.config().setOfflineMode(true);
        extentSparkReporter.config().setDocumentTitle("Execution Report");
        extentSparkReporter.config().setReportName("Test Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
    }
}
