package practicetest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSignin {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("hjgfdgtrfyt");

		driver.findElementByLinkText("Check Availability").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("userRegistrationForm:password").sendKeys("rogers123rogers123");
		
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("rogers123rogers123");
		
		List<WebElement> securityQ = driver.findElementsById("userRegistrationForm:securityQ");
		
		List<String> securityQ1 = new ArrayList<String>();
		
		for (WebElement questions : securityQ) {
			
			securityQ1.add(questions.getText());
			
		}

		System.out.println("Security questions are "+securityQ1);
		
		
		WebElement securityClass = driver.findElementById("userRegistrationForm:securityQ");
		
		Select sc = new Select(securityClass);
		
		sc.selectByIndex(3);
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Ajith");
		
		
		List<WebElement> prelan = driver.findElementsById("userRegistrationForm:prelan");
		
		List<String> prelan1 = new ArrayList<String>();

		for (WebElement language : prelan) {
			prelan1.add(language.getText());
		}
		
		System.out.println("Language lists are:"+prelan1);
		
		WebElement languageDD = driver.findElementById("userRegistrationForm:prelan");
		
		Select sc1 = new Select(languageDD);
		
		sc1.selectByValue("hi");
		
		sc1.selectByVisibleText("English");
		
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Ravi");
		
		WebElement gender = driver.findElementById("userRegistrationForm:gender:0");
		
		if(gender.isSelected())
			System.out.println("Male gender is selected");
		else
			gender.click();
		
		
		WebElement marital = driver.findElementById("userRegistrationForm:maritalStatus:0");
		
		if(marital.isSelected())
			System.out.println("Married status is already selected");
		else
			marital.click();
		
		
		driver.findElementByXPath("//option[text()='04']").click();
		
		driver.findElementByXPath("//option[text()='MAY']").click();
		
		driver.findElementByXPath("//option[text()='1993']").click();
		
		
		List<WebElement> occupation = driver.findElementsById("userRegistrationForm:occupation");
		
		List<String> occupation1 = new ArrayList<String>();
		
		for (WebElement occupationList : occupation) {
			occupation1.add(occupationList.getText());
			
		}
		System.out.println("Occupation lists are:"+occupation1);
		
		WebElement occu = driver.findElementById("userRegistrationForm:occupation");
		
		Select occup1 = new Select(occu);
		
		occup1.selectByVisibleText("Public");

		
		List<WebElement> country = driver.findElementsById("userRegistrationForm:countries");
		
		List<String> country1 = new ArrayList<String>();
		
		for (WebElement countryList : country) {
			
			country1.add(countryList.getText());	
		
			}
				
			System.out.println("Country lists are: "+country1);
			WebElement coun = driver.findElementById("userRegistrationForm:countries");
			
			Select countr = new Select(coun);
			countr.selectByVisibleText("India");
			
			Thread.sleep(2000);
			driver.quit();
		
	
	
	
	}
		

	}


