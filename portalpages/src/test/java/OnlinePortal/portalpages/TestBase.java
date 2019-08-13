package OnlinePortal.portalpages;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase { 
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize() throws IOException{
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--disable-notifications");		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ganesh\\Documents\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ganesh\\Documents\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		//To maximize browser
                driver.manage().window().maximize();
	        //Implicit wait
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To open facebook
                driver.get("https://www.facebook.com");
	}
	
	@AfterSuite
	//Test cleanup
	public void TeardownTest()
    {
        TestBase.driver.quit();
    }

}