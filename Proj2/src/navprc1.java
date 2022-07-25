import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navprc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navprc1 nh = new navprc1();
		nh.navhom();
	}
	
	public WebDriver driv()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/savinshetty/eclipse/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public void navhom()
	{
		WebDriver dri = this.driv();
		dri.get("https://rahulshettyacademy.com");
		dri.findElement(By.className("login-btn")).click();
//		dri.findElement(By.cssSelector(""));
		
	}
}
