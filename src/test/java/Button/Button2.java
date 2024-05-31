//Write a script to verify the button is clicked?
package Button;

//import static org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class Button2 extends BaseClass {

    @Test
    public void verifyButton() throws InterruptedException {
     
        Thread.sleep(2000);
        
       
        driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
        
       
        Thread.sleep(2000);
        
       
        driver.findElement(By.xpath("//section[text()='Button']")).click();
        
        
        Thread.sleep(2000);
        
        
        WebElement button1 = driver.findElement(By.xpath("//button[text()='Yes']"));
        button1.click();
        
       
        Thread.sleep(2000);
        
        
        WebElement button2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
        button2.click();
        
       
        Thread.sleep(2000);
        
        
        WebElement button3 = driver.findElement(By.id("btn8"));
        button3.click();
        
        
        Thread.sleep(2000);
        
        // Verify that all buttons are displayed after being clicked
       Assert.assertTrue(button1.isDisplayed() && button2.isDisplayed() && button3.isDisplayed());
    }
}




