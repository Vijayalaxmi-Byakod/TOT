import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchButton {
public static void main(String[] args) throws InterruptedException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the user name to search");
	String name=s.nextLine();

	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:3000/");
	driver.findElement(By.name("username")).sendKeys("viju");
	driver.findElement(By.className("password-container")).sendKeys("viju");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(name);
	Thread.sleep(2000);

	driver.findElement(By.className("searchbtn")).click();
	Thread.sleep(4000);
	driver.close();
	
}
}
