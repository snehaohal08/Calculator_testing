package calc.Calculator_project;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Arithmatic {
	
	// All anaptation are performend 

    EdgeDriver ed;

//    @BeforeSuite
    @Test(priority = 1)
    void launch() {

        ed = new EdgeDriver();

        ed.get("https://www.calculator.net/");
        ed.manage().window().maximize();
    }

//    @BeforeTest
    @Test(priority = 3)
    void add() throws InterruptedException {

        ed.findElement(By.xpath("//span[text()='2']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='+']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='3']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='=']")).click();
        Thread.sleep(500);
        
        String ans =ed.findElement(By.id("sciOutPut")).getText();
        System.out.println("Addition is: "+ans);
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='AC']")).click();
        Thread.sleep(500);
    }
//    @BeforeClass
    @Test(priority = 2)
    void Mul() throws InterruptedException {

        ed.findElement(By.xpath("//span[text()='1']")).click();
        Thread.sleep(500);
        ed.findElement(By.xpath("//span[text()='2']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='×']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='3']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='=']")).click();
        Thread.sleep(500);

        String ans =ed.findElement(By.id("sciOutPut")).getText();
        System.out.println("Multiplication is: "+ans);
        Thread.sleep(500);
        
        ed.findElement(By.xpath("//span[text()='AC']")).click();
        Thread.sleep(500);
    }
    
    
//    @BeforeMethod
    @Test(priority = 4)
    void Sub() throws InterruptedException {

        ed.findElement(By.xpath("//span[text()='2']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='0']")).click();
        Thread.sleep(500);
        
        ed.findElement(By.xpath("//span[text()='–']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='5']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='=']")).click();
        Thread.sleep(500);

        String ans =ed.findElement(By.id("sciOutPut")).getText();
        System.out.println("Substraction is: "+ans);
        Thread.sleep(500);
        
        ed.findElement(By.xpath("//span[text()='AC']")).click();
        Thread.sleep(500);
    }
    
    @Test(priority = 5)
    void Div() throws InterruptedException {

        ed.findElement(By.xpath("//span[text()='2']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='0']")).click();
        Thread.sleep(500);
        
        ed.findElement(By.xpath("//span[text()='/']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='5']")).click();
        Thread.sleep(500);

        ed.findElement(By.xpath("//span[text()='=']")).click();
        Thread.sleep(500);

        String ans =ed.findElement(By.id("sciOutPut")).getText();
        System.out.println("Division is: "+ans);
        Thread.sleep(500);
        
        ed.findElement(By.xpath("//span[text()='AC']")).click();
        Thread.sleep(500);
        
        ed.quit();
    }
    
}