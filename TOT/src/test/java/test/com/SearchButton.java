package test.com;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchButton {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://localhost:3000/");
	driver.findElement(By.name("username")).sendKeys("viju");
	driver.findElement(By.className("password-container")).sendKeys("viju");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("viju");
	Thread.sleep(2000);

	driver.findElement(By.className("searchbtn")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
