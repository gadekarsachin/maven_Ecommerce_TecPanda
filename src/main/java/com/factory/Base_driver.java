package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_driver {


	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public WebDriver initializedDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			tdriver.set(new ChromeDriver());
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tdriver.set(new  FirefoxDriver());
		}else {
			System.out.println(browser+"not supported");
		}
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	public static void main(String[] args) {
//		Base_driver sc = new Base_driver();
//		sc.initializedDriver("chrome");
	}
}
