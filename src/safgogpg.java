import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class safgogpg {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/savinshetty/eclipse/drivers/chromedriver");
		
		WebDriver drive = new ChromeDriver();
		
		drive.navigate().to("https://www.google.com");
		drive.close();
	}
}
