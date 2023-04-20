package test.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangeStatus {
	@Test
	public  void m1Test() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://localhost:3000/");
		driver.findElement(By.name("username")).sendKeys("viju");
		driver.findElement(By.className("password-container")).sendKeys("viju");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("viju");
		Thread.sleep(2000);

		driver.findElement(By.className("searchbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-cog']")).click();
		Thread.sleep(2000);
		//clicking on edit button
		Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

			driver.findElement(By.xpath("//button[text()='Edit']")).click();
		//navigated to update page and entering values to the fields
			driver.findElement(By.id("adhar_number")).sendKeys("123587968686");
			driver.findElement(By.id("pan_number")).sendKeys("aASKD1213i");
			WebElement drop=driver.findElement(By.id("status"));
			
			Select s=new Select(drop);
			s.selectByValue("placed");
			driver.findElement(By.className("btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("viju");
			Thread.sleep(2000);

			driver.findElement(By.className("searchbtn")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-cog']")).click();
			Thread.sleep(2000);
			//clicking on edit button
			for (int i = 0; i < 3; i++) {			
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}

}
}
