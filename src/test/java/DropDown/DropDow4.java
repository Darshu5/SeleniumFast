//How to select the values from the state drop-down by using the selectByvalue method.

package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDow4 extends BaseClass {
	
	@Test
	public void singleSelect() throws InterruptedException {

		// Click on UI Testing Concepts
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();

		// Click on Dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
				Thread.sleep(2000);
				WebElement coutry = driver.findElement(By.id("select3"));

				// Select the Value from dropdown
				Select sel = new Select(coutry);
				sel.selectByValue("Canada");
				
				Thread.sleep(2000);
				WebElement state = driver.findElement(By.id("select5"));

				// Select the Value from dropdown
				Select s = new Select(state);
				s.selectByValue("Alberta");

}
}

