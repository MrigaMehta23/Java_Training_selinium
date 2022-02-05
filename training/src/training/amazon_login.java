package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\git\\Java_Training_selinium\\training\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		WebElement e= d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println(e.getCssValue("background"));
		System.out.println(e.getCssValue("color"));
		System.out.println(e.getTagName());
	}
}
