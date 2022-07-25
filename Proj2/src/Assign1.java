import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		navprc1 en = new navprc1();
		WebDriver d = en.driv();
		Assign1 a = new Assign1();
		String tf = a.exeactions(d);
		System.out.println(tf);
	}
	
	public String exeactions(WebDriver d) {
		d.get("https://the-internet.herokuapp.com");
		d.findElement(By.linkText("Nested Frames")).click();
		//Set<String> winhands = d.getWindowHandles();
		//Iterator<String> Ite = winhands.iterator();
		//String Parent = Ite.next();
		//String Child = Ite.next();
		//d.switchTo().window(Child);
		//WebElement we0 = d.findElement(By.cssSelector
		//		("frameset"));
		//d.switchTo().frame(we0);
		WebElement we = d.findElement(By.cssSelector
				("frame[name='frame-top']"));
		d.switchTo().frame(we);
		//WebElement we1 = d.findElement(By.cssSelector
		//		("frameset[name='frameset-middle']"));
		//d.switchTo().frame(we1);
		WebElement we2 = d.findElement(By.cssSelector
				("frame:nth-child(2)"));	
		d.switchTo().frame(we2);
		String t = d.findElement(By.cssSelector("#content")).getText();
		d.switchTo().defaultContent();
		d.navigate().back();
		d.close();
		return t;
	}

}
