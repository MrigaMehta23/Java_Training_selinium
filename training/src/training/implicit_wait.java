package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\git\\Java_Training_selinium\\training\\exe\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
	WebElement e=	d.findElement(By.xpath("//div[@id='finish']//child::h4"));
	System.out.print(e.getText());
	}
	
}

