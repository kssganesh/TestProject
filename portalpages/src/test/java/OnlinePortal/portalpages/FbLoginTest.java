package OnlinePortal.portalpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FbLoginTest extends TestBase{
	
	@Test
	public void init() throws Exception{

			//driver.get("https://www.facebook.com");
			FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
			loginpage.setEmail("kssganesh@gmail.com");
			loginpage.setPassword("Ganesh@5973");
			loginpage.clickOnLoginButton();
			Thread.sleep(30000);
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
			FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
			homepage.clickOnProfileDropdown();
			homepage.verifyLoggedInUserNameText();
			homepage.clickOnLogoutLink();	
		}
}
