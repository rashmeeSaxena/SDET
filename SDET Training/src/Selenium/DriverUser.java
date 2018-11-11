package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.openqa.selenium.Alert;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;
import com.sun.jna.platform.win32.WinDef.CHAR;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import org.openqa.selenium.support.ui.Select;
import java.util.regex.Pattern;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;



public class DriverUser

{
	
public static void main(String[] args) {
	
WebDriver driver;

System.out.println("reminder:" +6%4);
	 
System.setProperty("webdriver.chrome.driver", "jars\\chromedriver.exe");
//System.out.println("reminder:" +6%4);

driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/");

//login Test
//driver.findElement(by)

String str;

str= driver.getCurrentUrl();
System.out.println( "Value = "+ str);

}
}
 


