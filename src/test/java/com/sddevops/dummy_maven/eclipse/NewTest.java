package com.sddevops.dummy_maven.eclipse;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver webDriver;
  @Test
  public void f() {
  }
  
  
  @Test
  public void checkTitle() {
	  //Load republic poly website as a new page
	  webDriver.navigate().to("http://localhost:8090/CWF_CodeManagement_Julie/NewFileTest.jsp");
	  
	  //Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Appointments");
	  
	  System.out.println("title: "+webDriver.getTitle());
	  
  }
  
  


  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chrome driver version 106\\chromedriver.exe");
	  webDriver = new ChromeDriver(); 
  }

  @AfterTest
  public void afterTest() {
  }

}
