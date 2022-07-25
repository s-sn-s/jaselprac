import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2c3 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/savinshetty/eclipse/chromedriver");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https:/www.google.com");
			//drive.findElement(By.name("Search")).sendKeys("Savin SHETTY");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("0");
		a.add("1");
		a.add("2");
		a.add("3");
		System.out.println(drive.getTitle());
		System.out.println(a);
		drive.close();
		
	}
	
}
