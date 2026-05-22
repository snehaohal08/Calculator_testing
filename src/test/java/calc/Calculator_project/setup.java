package calc.Calculator_project;

import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.w3c.dom.ls.LSOutput;
import org.testng.annotations.AfterSuite;

public class setup {

    public static EdgeDriver ed;

    @BeforeSuite
    public void openBrowser() {

        ed = new EdgeDriver();
        ed.manage().window().maximize();

        ed.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(10));

        ed.get("https://www.calculator.net/");

        System.out.println("Browser Opened");
    }

    @AfterSuite
    public void closeBrowser() {
        ed.quit();
        System.out.println("Browser Closed");
    }
    
}