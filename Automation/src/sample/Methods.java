package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	WebDriver driver;

	public Methods(WebDriver _driver){
		driver = _driver ;
	}
	
	public void openRKPosURL()
	{
		driver.manage().window().maximize();
		driver.get("http://spos.rkapps.in");
	}
	
	public void clickSignIN() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/app-root/mat-toolbar/mat-toolbar-row/app-user/div/span[1]")).click();
		//driver.wait(5000);
		Thread.sleep(5000);
	}
	
	public void enterLoginCred() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='mat-input-2']")).sendKeys("demo@rkapps.in");
		
		driver.findElement(By.xpath("//*[@id='mat-input-1']")).sendKeys("demo");
		
		//driver.wait(5000);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-login/div/mat-card[2]/mat-card/mat-card-actions/button")).click();
		
		//driver.wait(5000);
		Thread.sleep(5000);
	}
	
	public void clickNewSale()
	{
		driver.findElement(By.linkText("New Sale")).click();
	}

}
