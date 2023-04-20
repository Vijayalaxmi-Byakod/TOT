package test.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://localhost:3000/");
		driver.findElement(By.name("username")).sendKeys("viju");
		driver.findElement(By.className("password-container")).sendKeys("viju");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("logosec")).click();
		driver.findElement(By.name("firstname")).sendKeys("Megha",Keys.TAB,"B",Keys.TAB,"megh@gamil.com",Keys.TAB,"megh1",Keys.TAB,"megh1",Keys.TAB,"7564546",Keys.TAB,"26-09-2000");
		driver.findElement(By.className("btn")).click();

}
}