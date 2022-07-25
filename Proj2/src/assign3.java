import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		navprc1 np = new navprc1();
		WebDriver d = np.driv();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement Table = d.findElement(By.cssSelector("#product"));
		int totalRow = Table.findElements(By.cssSelector("tr")).size();
		int totalCol = Table.findElements(By.cssSelector("tr th")).size();
		System.out.println(
				"Total number of rows and columns in our table is " 
						+ totalRow + " & " + totalCol + " respectively.");
		System.out.println("Second Intructor data is ");
		for (int i = 1; i <= totalCol; i++) {
			System.out.println(Table.findElement(
					By.cssSelector("tr:nth-child(3) td:nth-child(" + i + ")")).getText());
		}
		;

	}

}
