package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\training\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://automationpractice.com/");
	d.findElement(By.className("login")).click();
	d.findElement(By.xpath("//input[@id='email']")).sendKeys("username@gmail.com");
	d.close();
		
	}

}
