import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Ques3 {
    public static void main(String[] args) throws InterruptedException {
        
    	WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8754730904");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Guhan@2004");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
        String ur=driver.getCurrentUrl();
        if(ur.equals("https://www.amazon.in/gp/your-account/order-history?ref_=ya_d_c_yo")) {
            System.out.println("The page is showing the orders that you ordered");
        }
        else {
            System.out.println(false);
        }
//        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[3]/ul/li[3]/a")).click();
        String ur2=driver.getCurrentUrl();
        if(ur2.equals("https://www.amazon.in/gp/your-account/order-history?ref_=ppx_yo2ov_dt_b_tb_open&orderFilter=open")) {
            System.out.println("The page is showing the shipment");
        }
        else {
            System.out.println(false);
        }
//        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"orderTypeMenuContainer\"]/ul/li[5]/span/a")).click();
        String ur21=driver.getCurrentUrl();
        if(ur21.equals("https://www.amazon.in/gp/your-account/order-history?ref_=ppx_yo2ov_dt_b_tb_open&orderFilter=open")) {
            System.out.println("The page is showing the cancelled orders");
        }
        else {
            System.out.println(false);
        }
        Thread.sleep(1000);
        driver.close();
        
    }
}


