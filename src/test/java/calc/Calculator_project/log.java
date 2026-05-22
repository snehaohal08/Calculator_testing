package calc.Calculator_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class log extends setup {
	@Test(priority = 4)
    void log() throws InterruptedException {

        String[] logs = {"ln", "log"};

        for (int i = 0; i < logs.length; i++) {

            ed.findElement(By.xpath("//span[text()='" + logs[i] + "']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='0']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(1000);

            ed.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
        System.out.println("log");
    }
}
