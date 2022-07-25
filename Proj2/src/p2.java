import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/savinshetty/eclipse/chromedriver");
		
		WebDriver driv = new ChromeDriver();
			
		driv.get("https:/www.google.com");
	}

}
