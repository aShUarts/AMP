package com.ampapplication.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class commonSearch {

	@Test
public static void commonS()
{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-extensions");
	WebDriver driver = new ChromeDriver(options);	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://192.168.101.186/login.php");
	driver.findElement(By.id("email")).sendKeys("admin@asergis.com");
	driver.findElement(By.id("password")).sendKeys("welcome");
	driver.findElement(By.id("submit")).click();
	driver.findElement(By.linkText("Create Demo")).click();
	driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("Sandeep");

}

}
