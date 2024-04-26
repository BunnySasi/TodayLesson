package org.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static WebDriver driver;
	public static void main(String[] args) {
		//chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Hello");
//		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
//		System.out.println("Current Url:"+driver.getCurrentUrl());
//		System.out.println("Title Page:"+driver.getTitle());
//		String text = driver.findElement(By.xpath("//span[normalize-space()='Lionel Richie - Hello (Official Music Video)']")).getText();
//		System.out.println(text);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String vegetable = driver.findElement(By.xpath("//h4[normalize-space()='Tomato - 1 Kg']")).getText();
		System.out.println(vegetable);
		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(vegetable);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Top Deals")).click();
//		//firefox
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		driver.get("https://www.google.com");
		
	
		
	}

}
