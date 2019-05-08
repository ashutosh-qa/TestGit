import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InvokeFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class name=FirefoxDriver
		

				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ashut\\Downloads\\Work\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				
				//Open Google
				driver.get("http://www.google.com");
				
				//Maximize Browser
				driver.manage().window().maximize();
				
				//get Title
				System.out.println(driver.getTitle());
				
				//TO close browser
				driver.close();
		
	}

}
