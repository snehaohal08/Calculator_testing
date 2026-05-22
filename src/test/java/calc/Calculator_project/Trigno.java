package calc.Calculator_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Trigno extends setup {

    @Test
    public void Trignomatric() throws InterruptedException {

        String[] trig = {"sin", "cos", "tan"};

        for(int i=0;i<trig.length;i++) {

            ed.findElement(
            By.xpath("//span[contains(text(),'" + trig[i] + "')]"))
            .click();

            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
        System.out.println("Trioagno");
    }
}