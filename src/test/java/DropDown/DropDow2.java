
//How to select the values from the Multi select dropdown ?
package DropDown;


	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class DropDow2 extends BaseClass {

		@Test
		public void singleSelect() throws InterruptedException {

			// Click on UI Testing Concepts
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("a[class='block w-[100%] h-full']")).click();

			// Click on Dropdown
			Thread.sleep(5000);
			driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
			
			driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
			
			WebElement dropdown=driver.findElement(By.id("select-multiple-native"));
			Select s= new Select(dropdown);

			  s.selectByValue("Canada");
		        s.selectByValue("Germany");
		        s.selectByValue("Poland");

		}

	}


