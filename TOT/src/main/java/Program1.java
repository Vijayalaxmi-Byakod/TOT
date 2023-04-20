import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:3000/");
	driver.findElement(By.name("username")).sendKeys("viju");
	driver.findElement(By.className("password-container")).sendKeys("viju");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(2000);
	Robot robot = new Robot();
	for (int i = 0; i < 3; i++) {			
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
Thread.sleep(2000);
//clicking on settings icon
	driver.findElement(By.xpath("//i[@class='fa fa-cog']")).click();
	Thread.sleep(2000);
	//clicking on edit button
		driver.findElement(By.xpath("//button[text()='Edit']")).click();
	//navigated to update page and entering values to the fields
		driver.findElement(By.id("adhar_number")).sendKeys("123587968686");
		driver.findElement(By.id("pan_number")).sendKeys("aASKD1213i");
		WebElement drop=driver.findElement(By.id("designation"));
		
		Select s=new Select(drop);
		s.selectByIndex(2);
		Thread.sleep(2000);
		String option=driver.findElement(By.xpath("//option[@value='Software Tester']")).getText();
		System.out.println(option);
		Thread.sleep(2000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-cog']")).click();
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//h3[text()='Software Tester']")).getText();		
		System.out.println(result);
if(result.contains(option))
{
	System.out.println("both are matching");
}
else
{
	System.out.println("Mismatching");
}
Thread.sleep(2000);
driver.close();
	
}
}