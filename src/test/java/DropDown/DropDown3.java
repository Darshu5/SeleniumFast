//How to select the values from the country drop-down by using the visibletext method.

package DropDown;


	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class DropDown3 extends BaseClass {

		@Test
		public void visibleText() throws InterruptedException {

			// Click on UI Testing Concepts
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();

			// Click on Dropdown
			Thread.sleep(5000);
			driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

			// Click on country
			

		

		}

	}


