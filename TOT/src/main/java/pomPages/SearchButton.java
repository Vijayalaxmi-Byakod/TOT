package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchButton {

	//Declaration
	
	@FindBy(xpath="//input[@placeholder='Search']") private WebElement searchbar;
	@FindBy(className="searchbtn") private WebElement searchButton;
	
	
	//Initialization
	public SearchButton(WebDriver driver) 
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
	public void SearchForUser(String username)
	{
		searchbar.sendKeys(username);
		
		searchButton.click();
		
	}


}
