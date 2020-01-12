package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rkApps {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("WebDriver.chrome.driver", "D:/Softwares/chromedriver.exe");
		
		Methods obj = new Methods(driver);
		
		obj.openRKPosURL();
		
		obj.clickSignIN();
		
		System.out.print("Completed");
	}

}
