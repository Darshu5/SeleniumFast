//Write a script to capture data from the textbox in the console that you have sent?
package WebElements;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBox2 extends BaseClass{
	@Test
	public void textB() throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();

		FileInputStream fis = new FileInputStream("src\\test\\resources\\DataRead.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String Name = p.getProperty("name");
		String Email = p.getProperty("email");
		String Password = p.getProperty("password");
		
		driver.findElement(By.id("name")).sendKeys(Name);
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("password")).sendKeys(Password);
		
		// Capture the data from the textBoxe
        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        System.out.println("Name: " + name.getAttribute("value"));
        System.out.println("Email: " + email.getAttribute("value"));
        System.out.println("Password: " + password.getAttribute("value"));

}
}
