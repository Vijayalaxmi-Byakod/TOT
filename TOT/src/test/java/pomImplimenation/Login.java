package pomImplimenation;

import org.openqa.selenium.WebDriver;

import genericLibraries.IConstantPath;
import genericLibraries.JavaUtility;
import genericLibraries.PropertyFileUtility;
import genericLibraries.WebDriverUtility;
import pomPages.LoginPage;

public class Login {
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
	

}
}
