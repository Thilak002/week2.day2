package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        driver.findElement(By.name("firstname")).sendKeys("Raj Thilak");
        driver.findElement(By.name("lastname")).sendKeys("tk");
        driver.findElement(By.name("reg_email__")).sendKeys("9629701142");
        driver.findElement(By.id("password_step_input")).sendKeys("tk123@#$");
        WebElement source = driver.findElement(By.id("day"));
        Select dropdown = new Select(source);
        dropdown.selectByVisibleText("4");
        WebElement source1 = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(source1);
		dropdown1.selectByValue("3");
		WebElement source2 = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(source2);
		dropdown2.selectByVisibleText("2018");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	

}
