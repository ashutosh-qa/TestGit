import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InvokeIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Class name=InternetExplorerDriver
		

		System.setProperty("webdriver.ie.driver", "C:\\Users\\ashut\\Downloads\\Work\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
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


