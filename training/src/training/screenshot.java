package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {
	public static WebDriver d;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\git\\Java_Training_selinium\\training\\exe\\chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/");
		
		take_ss("practice.jpg");
	}
	public static void take_ss(String filename) throws IOException
	{
		//1take ss and save it as file format
	File file=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	// copy the screenshot and save it to desired location
	FileUtils.copyFile(file,new File("C:\\Users\\hp\\git\\Java_Training_selinium\\training\\src\\training\\"+filename+".jpg"));
	}
}
