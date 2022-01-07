package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownedit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();   
         WebElement source = driver.findElement(By.className("dropdown"));
         Select dropdown = new Select(source);
         int size = dropdown.getOptions().size();
         dropdown.selectByValue("4");
	}

}
