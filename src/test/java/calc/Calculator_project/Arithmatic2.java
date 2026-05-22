package calc.Calculator_project;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Arithmatic2 extends setup {

    @Test
    public void arithmetic() throws InterruptedException {

    	String[] operator = {"+","–","/","×"};
    	
        for (int i = 0; i < operator.length; i++) {

            ed.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='" + operator[i] + "']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);

            ed.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
        System.out.println("arithmatic");
    }
}