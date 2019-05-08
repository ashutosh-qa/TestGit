import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium Code
		
		//Class name=ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashut\\Downloads\\Work\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
			
		driver.get("http://www.google.com");	//Open Google
		driver.manage().window().maximize();		//Maximize Browser
		System.out.println(driver.getTitle());	//get Title
		System.out.println(driver.getCurrentUrl()); //to check URL
		
		driver.get("http://www.yahoo.com");
		driver.navigate().back();
		//driver.close();	//TO close browser
		
	}

}
