package com.stepDefnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_login_page() {
		System.out.println("Step1: User is on login page");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    
	}

	@And("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step2: user enters the usernsme and password ");
//driver.close();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Admin");	
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("admin123");
	
	   }


@Then("click on login button")
	public void click_on_login_button() {
		System.out.println(" Step3: user clicking on login button");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println(" user is on lands on home page");
//driver.close();
		
	}
}
