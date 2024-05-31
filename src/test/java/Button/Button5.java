package Button;

//Write a script to check buttons are disabled?


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


	
	public class Button5 extends Button.BaseClass {

		@Test
		public void button() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//section[text()='Button']")).click();
			Thread.sleep(2000);
			
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement disable=driver.findElement(By.xpath("//button[text()='Yes']"));
			   assert disable.getAttribute("disabled") != null;
			Thread.sleep(2000);
			WebElement disable1=driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
			 assert disable1.getAttribute("disabled") != null;
			Thread.sleep(2000);
			WebElement disable2=driver.findElement(By.id("btn8"));
			 assert disable2.getAttribute("disabled") != null;
			
			
		}

}
