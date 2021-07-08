package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	
	public static void main(String[] args) {
		ChromeOptions opcion = new ChromeOptions();
		opcion.addArguments("--incognito");
		opcion.addArguments("--start-maximazed");
		System.setProperty("webdriver.chrome.driver", "Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opcion);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
