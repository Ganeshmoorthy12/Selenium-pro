package Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebdDriver.chrome.driver",
				"D:\\Soft\\Ganesh\\G1\\Ipt1\\Seleniun_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		/*driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Suganya");*/
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("https://demo.automationtesting.in/Frames.html")));
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Suganya");
		driver.switchTo().parentFrame();
	}

	
}
