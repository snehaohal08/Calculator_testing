package calc.Calculator_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;



public class Calculator_Ex {
    ChromeDriver cd;

    void openBrowser() {

        cd = new ChromeDriver();
        cd.get("https://www.calculator.net/");
        cd.manage().window().maximize();
    }

    void Arithmatic() throws InterruptedException {

    	String[] operator = {"+","–","/","×"};

        for (int i = 0; i < operator.length; i++) {

            cd.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='" + operator[i] + "']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }

    void Trignomatric() throws InterruptedException {
    	String[] Trig = {"sin","cos","tan"};
    	
    	for(int i =0 ; i<Trig.length;i++) {

            cd.findElement(By.xpath("//span[text()='"+Trig[i] + "']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()=')']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
    	}

    }
    void Trig_asin()throws InterruptedException {
    	String[] trig2 = {"asin", "acos", "atan"};
    	for(int i=0; i<trig2.length;i++) {
    	    cd.findElement(By.xpath("//span[@onclick=\"r('" + trig2[i] + "')\"]")).click();
    	    Thread.sleep(500);
    	    cd.findElement(By.xpath("//span[text()='0']")).click();
    	    cd.findElement(By.xpath("//span[text()='.']")).click();
    	    cd.findElement(By.xpath("//span[text()='5']")).click();
    	    Thread.sleep(500);
    	    cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
    	}
    }
    // xʸ , x³, x² ,eˣ,10ˣ
    void Square() throws InterruptedException {

        String[] square = {"x3", "x2"};
        for (int i = 0; i < square.length; i++) {

            // Enter 9
            cd.findElement(By.xpath("//span[text()='9']")).click();
            Thread.sleep(500);
            // Click x³ or x²
            cd.findElement(By.xpath("//span[@onclick=\"r('" + square[i] + "')\"]")).click();
            Thread.sleep(500);
            // Equal
            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(1000);
            // Clear
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }
    void Square2() throws InterruptedException {

        String[] square = {"ex", "10x"};
        for (int i = 0; i < square.length; i++) {

            // Enter 9
            cd.findElement(By.xpath("//span[text()='9']")).click();
            Thread.sleep(500);
            // Click x³ or x²
            cd.findElement(By.xpath("//span[@onclick=\"r('" + square[i] + "')\"]")).click();
            Thread.sleep(500);
            // Click 3
            cd.findElement(By.xpath("//span[text()='3']")).click();
            Thread.sleep(500);
            // Equal
            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(1000);
            // Clear
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }
    void log() throws InterruptedException {

        String[] logs = {"ln", "log"};

        for (int i = 0; i < logs.length; i++) {

            cd.findElement(By.xpath("//span[text()='" + logs[i] + "']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='0']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(1000);

            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }
    void footerlink() throws InterruptedException {

        String[] logs = {"about us","sitemap","terms of use" ,"privacy policy","calculator.net"};

        for (int i = 0; i < logs.length; i++) {

            cd.findElement(By.xpath("//a[text()='" + logs[i] + "']")).click();
            Thread.sleep(500);
            cd.navigate().back();
            Thread.sleep(500);

            
        }
    }
    
    void healthCalculatorLinks() throws InterruptedException {

        // Get all links inside ul id='hl2'
        List<WebElement> links =
                cd.findElements(By.xpath("//ul[@id='hl2']//a"));

        System.out.println("Total health CalculatorLinks links: " + links.size());

        for (int i = 0; i < links.size(); i++) {

            // Page reload ke baad fresh list lena
            links = cd.findElements(By.xpath("//ul[@id='hl2']//a"));

            // Link text print
            String text = links.get(i).getText();
            System.out.println("Opening: " + text);

            // Click link
            links.get(i).click();
            Thread.sleep(1000);

            // Back
            cd.navigate().back();
            Thread.sleep(1000);
        }
    }
    
    void financila() throws InterruptedException {
    	List<WebElement> link = cd.findElements(By.xpath("//ul[@id='hl1']//a"));
    	System.out.println("Total financial links = "+ link.size());
    	
    	for (int i = 0; i < link.size(); i++) {
			link = cd.findElements(By.xpath("//ul[@id='hl1']//a"));
			
			String text = link.get(i).getText();
			System.out.println("Opening: "+ text);
			
			
			// jevha element jast astat tevha scrollview use karto using javascrptExicutor using executeScript to run the file
			 JavascriptExecutor js = (JavascriptExecutor) cd;  // type casting kiya hai becuse executeScript this method is not exist in ChromeDriver()
		     js.executeScript("arguments[0].scrollIntoView(true);", link.get(i));
			
			link.get(i).click();
			Thread.sleep(1000);
			
			cd.navigate().back();
			Thread.sleep(1000);
		}
    }

    void MathCal() throws InterruptedException {
    	List<WebElement> link = cd.findElements(By.xpath("//ul[@id='hl3']//a"));
    	System.out.println("Total links of Mathematical calculator = "+ link.size());
    	
    	for (int i = 0; i < link.size(); i++) {
			link = cd.findElements(By.xpath("//ul[@id='hl3']//a"));
			
			String text = link.get(i).getText();
			System.out.println("Opening: "+ text);
			
			link.get(i).click();
			Thread.sleep(1000);
			
			cd.navigate().back();
			Thread.sleep(1000);
		}
    }
    void othercal() throws InterruptedException {
    	List<WebElement> link = cd.findElements(By.xpath("//ul[@id='hl5']//a"));
    	System.out.println("Total link of other links = "+ link.size());
    	
    	for (int i = 0; i < link.size(); i++) {
			link = cd.findElements(By.xpath("//ul[@id='hl5']//a"));
			
			String text = link.get(i).getText();
			System.out.println("Opening: "+ text);
			
			link.get(i).click();
			Thread.sleep(1000);
			
			cd.navigate().back();
			Thread.sleep(1000);
		}
    }
    public static void main(String[] args) throws InterruptedException {
    	Calculator_Ex c1 = new Calculator_Ex();

        c1.openBrowser();

//        c1.Arithmatic();
//
//        c1.Trignomatric();
//        
//        c1.Trig_asin();
//        
//        c1.Square();
//        
//        c1.Square2();
//        
//        c1.log();
        
//       c1.healthCalculatorLinks();
        
        
        c1.financila();
        System.out.println("*****************************************************************");
        c1.MathCal();
        System.out.println("*****************************************************************");
        c1.othercal();
        System.out.println("*****************************************************************");
//        c1.footerlink();

        
        c1.cd.quit();
	}
}
