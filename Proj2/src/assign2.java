import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navprc1 np = new navprc1();
		WebDriver d = np.driv();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("checkBoxOption3")).click();
		String optext = d.findElement(By.xpath(
				"//input[@id='checkBoxOption3']/parent::label")).getText();
		System.out.println(optext);
		WebElement selectele = d.findElement(By.name("dropdown-class-example"));
		Select s = new Select(selectele);
		s.selectByVisibleText(optext);
		d.findElement(By.cssSelector("#name")).sendKeys(optext);
		d.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(d.switchTo().alert().getText().contains(optext));
		d.switchTo().alert().dismiss();
		d.close();
	}
}
