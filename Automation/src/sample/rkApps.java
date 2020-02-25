package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rkApps {

	public static void main(String[] args) throws InterruptedException {
		
		// Commented added by Ramesh Menta added by santhi
		// Commented added by Ramesh Menta, it is now added by ramesh again
		// added 2nd line by Ramesh Menta
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("WebDriver.chrome.driver", "D:/Softwares/chromedriver.exe");
		
		Methods obj = new Methods(driver);
		
		obj.openRKPosURL();
		
		obj.clickSignIN();
		
		System.out.print("Completed");
	}

}
