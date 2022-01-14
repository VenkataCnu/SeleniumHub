package org.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.findElement(By.xpath("//a/b[text()='PIM']")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Netaji");
		driver.findElement(By.id("middleName")).sendKeys("Subhash");
		driver.findElement(By.id("lastName")).sendKeys("Chandhra Bose");
		// driver.findElement(By.id("photofile")).click();
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		Cookie cookie = new Cookie("MyCookie","9542336206");
		driver.manage().addCookie(cookie);
		
	
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie ck:cookies) 
		{
			System.out.println(ck);
		}
		
		driver.close();
		
	}
	
	
		}


