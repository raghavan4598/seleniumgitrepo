package testGit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCode {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.name("txtUsername")).sendKeys("Admin");
		d.findElement(By.name("txtPassword")).sendKeys("admin123");
		d.findElement(By.id("btnLogin")).click();
		System.out.println("login");
		
		
		
	}

}
