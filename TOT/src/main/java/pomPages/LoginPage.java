package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		//Declaration
		@FindBy(name="username") private WebElement userNameTextField;
		@FindBy(className="password-container") private WebElement passwordTextField;
		@FindBy(xpath="//button[text()='Submit']") private WebElement loginButton;
		
		//Initialization
		public LoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
	/**
	 * this method is used to login to the application
	 * @param username 
	 * @param password 
	 * 
	 */
		public void loginToApplication(String username, String password)
		{
			userNameTextField.sendKeys(username);
			passwordTextField.sendKeys(password);
			loginButton.click();
			
		}
	}

