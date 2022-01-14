package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Table_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Subhash chandhra");
		driver.findElement(By.id("lastName")).sendKeys("Bose");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_optGender_1")).click();

		Select dd_Nationality = new Select(driver.findElement(By.id("personal_cmbNation")));
		dd_Nationality.selectByVisibleText("Indian");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.linkText("PIM")).click();

		List<WebElement> trows =  driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
		System.out.println("Total Rows:- "+trows.size());
		
		
		
		

	}

}
