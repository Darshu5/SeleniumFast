//Write a script to double click on button?
package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button4 extends BaseClass {
	
	@Test
	public void doubleClick() throws InterruptedException {
		//Click on UI Testing Concepts
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
		
		//Click on Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		//Click On Double Click
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		//Create Actions Class using Double Click Action
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		WebElement double_click = driver.findElement(By.xpath("//button[@id='btn20']"));
		act.doubleClick(double_click).build().perform();
		
		//Double click Action
		Thread.sleep(1000);
		WebElement double_click2 = driver.findElement(By.id("btn23"));
		act.doubleClick(double_click2).build().perform();
		
		//Double click Action
		Thread.sleep(1000);
		WebElement double_click3 = driver.findElement(By.id("btn28"));
		act.doubleClick(double_click3).build().perform();
				
		
	}

}