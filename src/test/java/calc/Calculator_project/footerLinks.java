package calc.Calculator_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class footerLinks extends setup {

    @Test
    public void footerlink() throws InterruptedException {

    	String[] logs = {"about us","sitemap","terms of use" ,"privacy policy","calculator.net"};


        for(int i=0;i<logs.length;i++) {

            ed.findElement(By.linkText(logs[i])).click();

            Thread.sleep(1000);

            ed.navigate().back();

            Thread.sleep(1000);
        }
        System.out.println("footerlinks");
    }
}