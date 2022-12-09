package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {

	private WebDriver driver;

	private By email = By.xpath("//*[@id=\"input-email\"]");
	private By password = By.xpath("//*[@id=\"input-password\"]");
	private By button = By.xpath(" //*[@id=\"form-login\"]/button");

	public login_page(WebDriver driver) {
		this.driver = driver;
	}

	public String geterrortitle() {
		return driver.getTitle();
	}

	public void username(String username) {
		driver.findElement(email).sendKeys(username);
	}

	public void passname(String  password) {
		driver.findElement(this.password).sendKeys(password);
	}

	public void button() {
		driver.findElement(button).click();
	}
}
