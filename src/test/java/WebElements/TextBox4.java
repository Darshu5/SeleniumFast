//Write a script to enter data into disabled textbox
package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBox4 extends BaseClass {
	
	@Test
	public void Disable() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement disable = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].removeAttribute('disabled');", disable);
		js.executeScript("arguments[0].value = 'Darshana Nakade';", disable);
		
		WebElement disable_textfld = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].removeAttribute('disabled');", disable_textfld);
		js.executeScript("arguments[0].value = 'nakadedarshana28@gmail.com';", disable_textfld);
		
		WebElement textfield = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].removeAttribute('disabled');", textfield);
		js.executeScript("arguments[0].value = 'Darshana@01';", textfield);
		
		
		
	}

}
