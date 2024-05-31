package Link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Link4 extends BaseClass {
	
	@Test
	public void link() throws InterruptedException {

		//Click on UI Testing Concepts
		Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
        
        //Click on Links
        Thread.sleep(1000);
        driver.findElement(By.xpath("//section[text()='Link']")).click();
        
        //Click on Contacts
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        
        //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on About us
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='About Us']")).click();
        
        //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Career
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Career']")).click();
        
        //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on FAQ
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='FAQ']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on PAyments
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Payments']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Shippings
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Shippings']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on cancellation
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Cancellation & Returns General Policy Security Policy']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Return Policy
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Terms of use
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Terms of use']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Security
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Security']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Privacy
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Facebook
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Facebook']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on twitter
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Twitter']")).click();
        
      //It is used to go back to the main window
        Thread.sleep(1000);
        driver.navigate().back();
        
        //Click on Youtube
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Youtube']")).click();
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int Count = links.size();
        System.out.println("total umer of liks are:" +Count);
        
        
	}

}