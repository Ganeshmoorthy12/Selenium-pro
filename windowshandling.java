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

public class windowshandling {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("WebdDriver.chrome.driver",
				"D:\\Soft\\Ganesh\\G1\\Ipt1\\Seleniun_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement Best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		ac.moveToElement(Best).build().perform();
		
		ac.contextClick(Best).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Deals = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		
		ac.moveToElement(Deals).build().perform();
		
		ac.contextClick(Deals).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);
		
		System.out.println("--Windowshandles--");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String string : windowHandles) {
			
			String title = driver.switchTo().window(string).getTitle();
			
			System.out.println(title);
			
		}
		
		System.out.println("Completed--");
	}

}
