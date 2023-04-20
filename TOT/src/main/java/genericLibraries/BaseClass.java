package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.LoginPage;

public class BaseClass {

	protected WebDriverUtility web;
	protected PropertyFileUtility property;
	protected JavaUtility javaUtil;
	protected WebDriver driver;
	protected LoginPage login;
	//protected HomePage home;
	public static WebDriver sdriver;
	public static JavaUtility sjavaUtil;

	// @BeforeSuite
	// @BeforeTest
	@BeforeClass
	public void classSetup() {
		web = new WebDriverUtility();
		property = new PropertyFileUtility();
		javaUtil = new JavaUtility();
		sjavaUtil = javaUtil;
		property.propertyFileInitialization(IConstantPath.PROPERTY_FILE_PATH);
		String url = property.getDataFromProperties("url");
		String browser = property.getDataFromProperties("browser");
		long time = Long.parseLong(property.getDataFromProperties("timeouts"));

		driver = web.openApplication(browser, url, time);
		sdriver = driver;
		login = new LoginPage(driver);
	}

	@BeforeMethod
	public void methodSetup() {
		
		String username = property.getDataFromProperties("username");
		String password = property.getDataFromProperties("password");
		login.loginToApplication(username, password);
	}

	@AfterMethod
	public void methodTeardown() {
		
	}

	@AfterClass
	public void classTeardown() {
		web.closeBrowser();
	}
	// @AfterTest
	// @AfterSuite

}
