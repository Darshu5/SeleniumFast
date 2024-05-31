//Write a script to Enter data into text field which is having same attributes as other text field ?
package WebElements;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TextBox extends BaseClass{
	
	@Test
	public void textB() throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\ReadData.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String Name = p.getProperty("name");
		String Email = p.getProperty("email");
		String Password = p.getProperty("password");
		
		driver.findElement(By.id("name")).sendKeys(Name);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		
	}

}