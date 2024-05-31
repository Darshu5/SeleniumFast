//How to select the value from the single select dropdown ?
package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown1 extends BaseClass {

	@Test
	public void singleSelect() throws InterruptedException {

		// Click on UI Testing Concepts
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();

		// Click on Dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

		// Click on Gender
		Thread.sleep(2000);
		WebElement dropdpwn = driver.findElement(By.id("select2"));

		// Select the Value from dropdown
		Select sel = new Select(dropdpwn);
		sel.selectByValue("male");

	}

}
