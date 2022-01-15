package training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class basic {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\training\\exe\\chromedriver.exe");
				WebDriver d=new ChromeDriver();
				d.get("https://mail.rediff.com/cgi-bin/login.cgi");
				d.findElement(By.name("proceed")).click();
				d.switchTo().alert().accept();
			}

		
	}

