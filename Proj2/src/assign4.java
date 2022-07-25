import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assign4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		navprc1 np = new navprc1();
		WebDriver d = np.driv();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebDriverWait wdw = new WebDriverWait(d, Duration.ofSeconds(3));
		
		//dynamic drop-down captured
		WebElement dyDrop = 
				d.findElement(By.cssSelector(
						".inputs.ui-autocomplete-input"));
		String nation = "India";
		
		dyDrop.sendKeys("ind");
		
		//wdw.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
		//		By.cssSelector("#ui-id-1 div")
		//		));	
		String dd = Keys.chord
				(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		//dyDrop.sendKeys(dd);
		dyDrop.sendKeys(dd);
		//d.findElement(By.cssSelector("#ui-id-1>li>div:nth-child(2)")).click();
		/*List<WebElement> dyDropList =
				d.findElements(By.cssSelector(
					"#ui-id-1 div"));
			for(WebElement e : dyDropList)
		{
			if(e.getText().compareToIgnoreCase(nation)==1)
			{
				e.click();
				System.out.println(e.getText()+" selected!!");
				break;
			}
		}*/
		
		
		
	}

}
