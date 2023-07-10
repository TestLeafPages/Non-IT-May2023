package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		// set the path and launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Identify the table in the dom using <table>
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table"));
		// row count
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("Row Count:" + rowCount.size());
		// Column count
		List<WebElement> columnCount = table.findElements(By.tagName("td"));
		System.out.println("Column Count:" + columnCount.size());
		// print one row
		System.out.println(rowCount.get(1).getText());

		String text = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table//tr[3]/td[3]"))
				.getText();

		System.out.println(text);
		
		for (int i =1; i < rowCount.size(); i++) {
			
			String text2 = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table//tr["+i+"]/td[1]")).getText();
			System.out.println(text2);
			
			//div[contains(@class,'ui-panel-content')]/table//tr["+i+"]/td[1]
			
		}
		for(int j =1; j <4; j++) {
			String text2 = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table//tr[2]/td["+j+"]")).getText();
		System.out.println(text2);

	}

}
}
