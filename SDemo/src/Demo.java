import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sumeet\\Downloads\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
				
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();;
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();;
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]")).click();;
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FirstName\"]")).sendKeys("Sumeet");;
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_LastName\"]")).sendKeys("Ghosh");;
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Email\"]")).sendKeys("example@test.com");;
		
		//dropdown code
		Select dCountry = new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
		dCountry.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("Pune");;
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("1234");;
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("123456");;
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("0123456789");;
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();;

		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		
		Thread.sleep(3000);
		
	//	System.out.println("Code executed");
		
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		
		Thread.sleep(3000);
		
		//System.out.println("Code executed1");
		
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
		
	
		Thread.sleep(3000);
		driver.close();
	
		System.out.println("Thanks code executed");
	}
}
