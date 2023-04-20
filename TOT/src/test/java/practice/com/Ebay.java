package practice.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay {
public static void main(String[] args) throws AWTException 
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.ebay.com/");
	driver.findElement(By.xpath("//div[@class='hl-cat-nav']//li[3]")).click();
	driver.findElement(By.xpath("//span[text()='Cell Phones & Accessories']")).click();
	driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']")).click();
	driver.findElement(By.xpath("//span[text()='- Shop by Brand']/..")).click();
	driver.findElement(By.xpath("//span[text()='Screen Size']")).click();
	driver.findElement(By.id("c3-subPanel-Screen%20Size_4.0%20-%204.4%20in_cbx")).click();
//For zooming out
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_MINUS);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_MINUS);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,200);");
WebElement price=driver.findElement(By.xpath("//span[text()='Price']"));

	 
	
}
}
