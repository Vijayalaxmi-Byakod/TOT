package pomImplimenation;

import org.openqa.selenium.WebDriver;

import genericLibraries.IConstantPath;
import genericLibraries.JavaUtility;
import genericLibraries.PropertyFileUtility;
import genericLibraries.WebDriverUtility;
import pomPages.CreateAccountPage;
import pomPages.DashBoardPage;
import pomPages.LoginPage;

public class CreateAccount {

public static void main(String[] args) {
		
		WebDriverUtility web = new WebDriverUtility();
		JavaUtility javaUtil = new JavaUtility();
		PropertyFileUtility property = new PropertyFileUtility();
		property.propertyFileInitialization(IConstantPath.PROPERTY_FILE_PATH);	
		String url = property.getDataFromProperties("url");
		String browser = property.getDataFromProperties("browser");
		long time = Long.parseLong(property.getDataFromProperties("timeouts"));
		
		WebDriver driver = web.openApplication(browser, url, time);
		LoginPage log = new LoginPage(driver);
		
		String username = property.getDataFromProperties("username");
		String password = property.getDataFromProperties("password");
		log.loginToApplication(username, password);
	
		DashBoardPage dash=new DashBoardPage(driver);
		dash.createUser();
		
		CreateAccountPage CreateAccount = new CreateAccountPage(driver);
		
		String firstName = property.getDataFromProperties("firstName");
		String lastName = property.getDataFromProperties("lastName");
		String email = property.getDataFromProperties("email");
		String password1 = property.getDataFromProperties("password1");
		String confPwd = property.getDataFromProperties("confPwd");
		String mobNo =property.getDataFromProperties("mobNo");
		String date = property.getDataFromProperties("date");
		CreateAccount.accountCreation(firstName,lastName,email,password1,confPwd,mobNo,date);
	
		web.closeBrowser();
}


}
