package training;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\git\\Java_Training_selinium\\training\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//WebElement e2= d.findElement(By.xpath("(//a[@class='_2a3TMW'])[2]"));
		//e2.click();
		//WebElement e3= d.findElement(By.xpath("(//a[@class='_2a3TMW'])[3]"));
		//WebElement e4= d.findElement(By.xpath("(//a[@class='_2a3TMW'])[4]"));
		//WebElement e5= d.findElement(By.xpath("(//a[@class='_2a3TMW'])[5]"));
		//WebElement e6= d.findElement(By.xpath("(//a[@class='_2a3TMW'])[6]"));
		//clickon(d,Realme,5);
		WebElement m1= d.findElement(By.xpath("(//a[@class='_2a3TMW'])[1]"));
		
		/*clickon(d,e2,5);
		clickon(d,e4,5);
		clickon(d,e5,5);
		clickon(d,e6,5);*/
		clickon(d,m1,155);
		
		
	}
	public static void clickon(WebDriver d1,WebElement e1,int timeout)
	{
	WebElement wait=new WebDriverWait(d1,timeout).until(ExpectedConditions.elementToBeClickable(e1));
	JavascriptExecutor jse = (JavascriptExecutor)d1;
	jse.executeScript("arguments[0].click()", e1); //js click
	}
}
