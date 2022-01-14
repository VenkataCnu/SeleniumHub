package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")).sendKeys("srinivas.agyarapu@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shrivas_206");
		driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
