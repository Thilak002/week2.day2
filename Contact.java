package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys( "DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("RajThilak");
		driver.findElement(By.id("lastNameField")).sendKeys("G");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("raj");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("tk");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.name("description")).sendKeys("goodwork");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("thilakrajj002@gmail.com");
		WebElement source = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Missouri");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("pleasedosomething");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.close();

	}

}
