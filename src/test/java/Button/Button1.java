//Write a script to Click On A Button ?
package Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import WebElements.BaseClass;

public class Button1 extends Button.BaseClass {

	@Test
	public void button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn8")).click();
		
		
	}
}