package Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) {
		
		System.setProperty("WebdDriver.chrome.driver",
				"D:\\Soft\\Ganesh\\G1\\Ipt1\\Seleniun_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/women-kurtas");
		
		driver.findElement(By.xpath("(//span[@class='product-discountPercentage'])[1]//ancestor::span")).click();
		
	}
}
