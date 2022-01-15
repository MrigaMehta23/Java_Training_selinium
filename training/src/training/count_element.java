package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\training\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		List<WebElement> e=d.findElements(By.tagName("a"));
		System.out.print(e.size());
		for(int i=0;i<e.size();i++)
		{
			if(i<5)
				System.out.println(e.get(i).getText());
		}
		d.close();
	}

}
