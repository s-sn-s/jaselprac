import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver"
				,"/Users/savinshetty/eclipse/chromedriver" );
		WebDriver drive = new ChromeDriver();
		drive.manage().window().fullscreen();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		drive.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println( drive.findElements(By.cssSelector("a")).size());
		drive.close();
	}
	
	
	
}