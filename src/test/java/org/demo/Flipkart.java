package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9542336206");
	
		//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shrivas_206");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")).click();
		
	}

}
