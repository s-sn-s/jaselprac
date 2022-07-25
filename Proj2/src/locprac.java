import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locprac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		locprac loloagaya = new locprac();
		//WebDriver PortalKey = loloagaya.openDPortal();
		loloagaya.upsidedown(loloagaya.openDPortal());
	}
	
	public WebDriver openDPortal()
	{
		System.setProperty("webdriver.chrome.driver","/Users/savinshetty/eclipse/chromedriver");
		WebDriver PortalPass = new ChromeDriver();
		return PortalPass;
	}
	
	public void upsidedown(WebDriver passMeTheKey) throws InterruptedException
	{
		passMeTheKey.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(passMeTheKey.getCurrentUrl());
		passMeTheKey.navigate().to("https://rahulshettyacademy.com/");
		System.out.println(passMeTheKey.getCurrentUrl());
		passMeTheKey.navigate().back();
		System.out.println(passMeTheKey.getCurrentUrl());
		passMeTheKey.findElement(By.id("inputUsername")).sendKeys("Zoro");
		passMeTheKey.findElement(By.name("inputPassword")).sendKeys("hello");
		passMeTheKey.findElement(By.cssSelector("input#chkboxOne")).click();
		passMeTheKey.findElement(By.xpath("//*[text()='Sign In']")).click();
		passMeTheKey.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		passMeTheKey.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Zoro");
		passMeTheKey.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("zoroshetty@gmaill.com");
		passMeTheKey.findElement(By.cssSelector(".form-container.sign-up-container>form>input:nth-child(4)"))
		.sendKeys("1244210000");
		Thread.sleep(2000);
		passMeTheKey.close();
	}
	
}
