//Write a script to Click on a Link text which open in new tab

package Link;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Link2 extends BaseClass {
	@Test
	public void Link() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Link in New Tab']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	Set<String> ids= driver.getWindowHandles();
	System.out.println(ids);
	for(String pc:ids) {
		String title=driver.switchTo().window(pc).getTitle();
		System.out.println(title);
		
		String childtitle="Demoapps | Qspider";
		if(title.contains(childtitle)){
			break;
		
	
	
}
}
	}
}