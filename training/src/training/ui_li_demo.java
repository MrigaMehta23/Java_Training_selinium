package training;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ui_li_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\git\\Java_Training_selinium\\training\\newdriver\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.moneycontrol.com/stocksmarketsindia/");
		d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions a=new Actions(d);
		WebElement e1= d.findElement(By.xpath("//li[@class='menu_l1 active sub_nav']//a[@title='Markets'][normalize-space()='Markets']"));
		a.moveToElement(e1).perform();
		List<WebElement> e=d.findElements(By.xpath("//ul[contains(@class,'market_menu clearfix')]//li//a"));
		//WebElement wait=new WebDriverWait(d,40).until(ExpectedConditions.visibilityOf(e));
		//List<WebElement> value=e.findElements(By.tagName("li"));
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i).getText());
			 
			if(e.get(i).getText().contains("HOME"))
			{
				e.get(i).click();
				break;
			}
		}
	}

}
