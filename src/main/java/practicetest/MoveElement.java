package practicetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable-notifications");
		
		ChromeDriver driver  = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.getKeyboard().sendKeys(Keys.ESCAPE);


		Actions builder = new Actions(driver);

		WebElement electronics = driver.findElementByLinkText("Electronics");

		WebElement gaminingLaptops = driver.findElementByLinkText("Gaming Laptops");


		builder.moveToElement(electronics).perform();

		Thread.sleep(2000);

		builder.click(gaminingLaptops).perform();

		Thread.sleep(2000);
		
		driver.findElementByXPath("(//div/a[1])[13]").click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		
		List<String> allwindows1 = new ArrayList<String>();
		allwindows1.addAll(allWindows);
		
		
		String secWindow = allwindows1.get(1);
		
		driver.switchTo().window(secWindow);
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
