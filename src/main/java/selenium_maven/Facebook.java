package selenium_maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Facebook {

	@Test
	public void Test__Login()
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.findElement(By.id("email")).sendKeys("Pavansai@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Test@1234");
	driver.findElement(By.name("login")).click();
	String Actual_Title= driver.getTitle();
	System.out.println("Title of the Page after Login is        "+Actual_Title);
	
	if(Actual_Title.equals("Facebook"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
	
	driver.quit();
	}
}

