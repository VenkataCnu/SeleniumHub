package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='Admin']")).click();
		WebElement ele = driver.findElement(By.id("searchSystemUser_userType"));
		
		Select se = new Select(ele);
		System.out.println(se.isMultiple());
		//System.out.println(se.toString());
		// System.out.println(se.getOptions());
		
		
		driver.close();

}
}