package LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Learning1 {

	public static void main(String[] args)
    {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("https://www.myntra.com/");
		Driver.findElement(By.xpath("//*[@id='desktop-headerMount']/div/div/div/div[2]/div[4]/div/span[2]")).click();
		Driver.findElement(By.xpath("html/body/div[1]/div[1]/div[5]/div[2]/div[2]/a[2]")).click();
		//Driver.findElement(By.linkText("SignUup")).click();
		Driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/form/fieldset[1]/div[1]/input")).sendKeys("xyz@gmail.com");
		Driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/form/fieldset[1]/div[2]/input")).sendKeys("xyz");
		Driver.findElement(By.xpath("//*[@id='mountRoot']/div/div/div/form/fieldset[2]/button")).click();
	}

}
