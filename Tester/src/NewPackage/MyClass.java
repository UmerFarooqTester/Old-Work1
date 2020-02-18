package NewPackage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse IDE\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser openedd");
		
		driver.get("http://q.kalgera.co.uk/login");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("q.kalgera.co"));
		System.out.println("Application loaded");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div/div/input")).sendKeys("umer.farooq+ethan@seventechnology.co.uk");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/input")).sendKeys("umer1234");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[3]/button")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
