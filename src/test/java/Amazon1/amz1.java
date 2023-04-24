package Amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amz1 {

	public static void main(String[] args) throws Throwable  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike bags");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).click();
		Thread.sleep(2000);
		
	}

}
