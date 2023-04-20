package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

	//Declaration
	//@FindBy(className="logosec") private WebElement createButton;
	@FindBy(name="firstname") private WebElement firstnameTextField;
	@FindBy(name="lastname") private WebElement lastnameTextField;
	@FindBy(id="email") private WebElement emailIDTextField;
	@FindBy(id="password") private WebElement passwordTextField;
	@FindBy(id="confirm-password") private WebElement confirmPasswordTextField;
	@FindBy(id="mobile_number") private WebElement mobileNoTextField;
	@FindBy(id="date") private WebElement dateTextField;
	@FindBy(xpath="//button[text()='Submit']") private WebElement submitButton;
	
	//Initialization
	public CreateAccountPage(WebDriver driver) 
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
	public void accountCreation(String firstName, String lastName,String email,String password1,String confPwd,String mobNo,String date )
	{
		firstnameTextField.sendKeys(firstName);
		lastnameTextField.sendKeys(lastName);
		emailIDTextField.sendKeys(email);
		passwordTextField.sendKeys(password1);
		confirmPasswordTextField.sendKeys(confPwd);
		mobileNoTextField.sendKeys(mobNo);
		dateTextField.sendKeys(date);
		submitButton.click();
		
	}


}
