package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpth {
public static WebDriver driver;
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://economictimes.indiatimes.com/MARKETS");
WebElement w=driver.findElement(By.xpath("//span[@class='hl']/following-sibling::span[@class='price']"));
	System.out.println(w.getText());
	driver.close();
	

	}

}
