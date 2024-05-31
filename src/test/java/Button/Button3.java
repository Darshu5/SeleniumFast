 //Write a script to right click on button?
package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button3 extends BaseClass{
	
	@Test
	public void rightClick() throws InterruptedException {
		//Click on UI Testing Concepts
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
		
		//Click on Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		//Click on Right Click
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		//Create Actions class for Clicking right Click
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement right_click = driver.findElement(By.xpath("//button[@id='btn30']"));
		act.contextClick(right_click).build().perform();
		
		//Click on Yes
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(2000);
		
	    //Right Click
		WebElement right_click2 = driver.findElement(By.xpath("//button[@id='btn31']"));
		act.contextClick(right_click2).build().perform();
		
		//Click on NO
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='No']")).click();
		
		//Right Click
		WebElement right_click3 = driver.findElement(By.xpath("//button[@id='btn32']"));
		act.contextClick(right_click3).build().perform();
		
		//Click on Give Rating
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='4']")).click();
		
	}

}
