package Demo_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Pro {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("WebdDriver.chrome.driver",
				"D:\\Soft\\Ganesh\\G1\\Ipt1\\Seleniun_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone13\n");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - (Product) RED'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();//windows handling method
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();{
			}
		}
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("attach-view-cart-button-form")).click();
		
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.xpath("//select[@name='quantity']"));
		
		Select s=new Select(findElement);
		
		s.selectByValue("4");
		
		

		
		
		
	}
	
}
