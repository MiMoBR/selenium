package com.selenium.Mimobr2;

import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rnco\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mimobr.com/form-simple/forms.html");
		
		try {
			for(int i = 0 ; i< 1000 ; i++) {
				Thread.sleep(3000);
				System.out.print(i);
				driver.findElement(ById.id("name")).sendKeys("reinaldo nani");	
				driver.findElement(ById.id("email")).sendKeys("reinaldo@mimobr.com");	
				driver.findElement(ById.id("telephone")).sendKeys("939535195");	
				driver.findElement(ById.id("btnSignForm")).click();		
				Thread.sleep(3000);
				driver.findElement(ByClassName.className("btnSecond")).click();	
				driver.navigate().refresh();
				driver.get("https://mimobr.com/form-simple/forms.html");
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
