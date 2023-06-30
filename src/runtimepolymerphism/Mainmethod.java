package runtimepolymerphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainmethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
	
	Factory.test(new ChromeDriver());

	Factory.test(new FirefoxDriver());
	
	Factory.test(new EdgeDriver());
	
	//Dependence code is Factory class 
}
}
