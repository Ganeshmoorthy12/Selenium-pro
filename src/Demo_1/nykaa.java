package Demo_1;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nykaa {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("WebdDriver.chrome.driver",
				"D:\\Soft\\Ganesh\\G1\\Ipt1\\Seleniun_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		driver.manage().window().maximize();
		driver.get(
				"https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gclid=Cj0KCQiAic6eBhCoARIsANlox87rnUece83eQ_3F-LfcLgfPiX3JHLs6i9YipMlC4cF5LGQBBYjRhVoaAnfaEALw_wcB");
		driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).sendKeys("Face mask");
		r.keyPress(KeyEvent.VK_ENTER);//robot method
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//wait
		driver.findElement(By.xpath("//div[text()='Nykaa Clay It Cool Clay Mask']")).click();//product
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Set<String> windowHandles = driver.getWindowHandles();//windows handling method
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();{
			}
		}
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();// add to bag
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();// going to cart
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));// adding extra qty
		driver.switchTo().frame(findElement);

		driver.findElement(By.xpath("//p[@data-test-id='select-quantity']")).click();
		driver.findElement(By.xpath("(//div[@class='css-bfwsku'])[1]")).click();//adding qty nos
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		driver.findElement(By.xpath("//button[text()='Log In']")).click();//
		driver.findElement(By.xpath("//div[@class='form-field-plain login-wrap']")).click();
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("ganeshmoorthy12@gmail.com\n");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='send otp to email']")).click();

		Scanner sug = new Scanner(System.in);//otp
		System.out.println("enter the otp");
		String n = sug.next();
		driver.findElement(By.name("otpValue")).sendKeys(n);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='css-n7wnfc e8tshxd0']")).click();//address
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Cash on delivery']")).click();//cod

	}

}
