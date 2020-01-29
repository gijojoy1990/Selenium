package com.TuesdayPractice.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCl
{
    WebDriver driver;
  @BeforeClass
    public static void SetUpDrivers()
  {
      WebDriverManager.chromedriver().setup();
  }

  @Before
    public void OpenBrowser()
  {
      driver = new ChromeDriver();
      driver.get("https://www.google.co.uk");
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();

  }
}
