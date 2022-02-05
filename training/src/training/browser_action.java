package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_action {
	public static WebDriver d;
	public void openurl()
	{
		d.get("https://the-internet.herokuapp.com/");
	}
	public void closebrowser()
	{
	d.close();	
	}
	public void click_link()
	{
		d.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();
	}
	public void go_to_backpage()
	{
		d.navigate().back();
	}
	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\hp\\\\git\\\\Java_Training_selinium\\\\training\\\\exe\\\\chromedriver.exe");
		d= new ChromeDriver();
		browser_action obj=new browser_action();
		obj.openurl();
		Thread.sleep(100);
		obj.click_link();
		obj.go_to_backpage();
		Thread.sleep(100);
		obj.closebrowser();
	}
}

