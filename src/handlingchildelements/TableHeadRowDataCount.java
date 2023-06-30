package handlingchildelements;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHeadRowDataCount {
// Was to verify Table Head <th>, Table Row <tr>, Table Data <td> count is correct or not in sensex table
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/stocks/marketstats/hourly_gain/bse/curr_hour/");
		
		WebElement movingAvgTable = driver.findElement(By.id("moving_avg"));
		
		List<WebElement> tableHeadersList = movingAvgTable.findElements(By.tagName("th"));
		for (WebElement ele : tableHeadersList) {
			System.out.println(ele.getText());
		}
		
		int expectedTHCount=3;
		int actualTHCount=tableHeadersList.size();
		
		System.out.println("expectedTHCount="+expectedTHCount);
		System.out.println("actualTHCount="+actualTHCount);
		
		if (actualTHCount==expectedTHCount) {
			System.out.println("Pass:: The Table Header Count is Correct");
		}else {
			System.out.println("Fail:: The Table Header Count is InCorrect");
		}
		System.out.println("---------------------------------");
		
		List<WebElement> tableRowList = movingAvgTable.findElements(By.tagName("tr"));
		int expectedRowCount=5;
		int actualRowCount=tableRowList.size();
		
		System.out.println("expectedRowCount="+expectedRowCount);
		System.out.println("actualRowCount="+actualRowCount);
		
		if (actualRowCount==expectedRowCount) {
			System.out.println("Pass:: The Table Row Count is Correct");
		} else {
			System.out.println("Fail:: The Table Row Count is InCorrect");
		}
		
		System.out.println("---------------------------------");
		
		List<WebElement> tableDataList = movingAvgTable.findElements(By.tagName("td"));  // By.xpath(".//td"));
		
		for (WebElement ele : tableDataList) {
			System.out.println(ele.getText());
		}
		
		int expectedTDCount=12;
		int actualTDCount=tableDataList.size();
		
		System.out.println("expectedTDCount="+expectedTDCount);
		System.out.println("actualTDCount="+actualTDCount);
		
		if (actualTDCount==expectedTDCount) {
			System.out.println("Pass:: The Table Data Count is Correct");
		} else {
			System.out.println("Fail:: The Table Data Count is InCorrect");

		}
		driver.quit();
	}

}


//Note:: If you want xpath
//       use dot before .//td
//       then it will be selecting current movingAvgTable direct
//    other wise it will selecting initial html to upto end;