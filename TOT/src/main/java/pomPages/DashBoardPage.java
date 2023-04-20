package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	//Declaration
	
	@FindBy(className="logosec") private WebElement createButton;
		
		
		//Initialization
		public DashBoardPage(WebDriver driver) 
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
		public void createUser()
		{
			
			
			createButton.click();
			
		}


}
