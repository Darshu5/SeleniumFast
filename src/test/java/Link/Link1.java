package Link;

//Write a script to Click On Link Text ?



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Link1  extends BaseClass{
	@Test
	public void Link() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Shippings']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	

}
