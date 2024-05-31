package Link;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;

	 
	public class BaseClass {	
		protected	WebDriver driver;
		
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Connect to the DataBase");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Pre Condition for test Runner");
			
		}
		
		@BeforeClass
		public void beforeClass() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demoapps.qspiders.com/");
			
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Login succesful");
//			driver.findElement(By.xpath("//section[text()='Text Box']")).click();
//			driver.findElement(By.id("name")).sendKeys("Darshana Nakade");
//			driver.findElement(By.id("email")).sendKeys("nakadedarshana28@gmail.com");
//			driver.findElement(By.id("password")).sendKeys("Darshana@01");
//			driver.findElement(By.xpath("//button[text()='Register']")).click();
//			
			
			
		}
		
		@AfterMethod
		public void afterMethod()  {
			System.out.println("LogOut succesful");
		}
		
		@AfterClass
		public void afterClass() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}
		
		@AfterTest
		public void afterTest() throws InterruptedException {
			System.out.println("Post  Condition for test Runner");
			
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("To DissConnect from the DataBase");
		}
		
		

	}





