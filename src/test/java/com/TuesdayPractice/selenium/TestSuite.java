package com.TuesdayPractice.selenium;

import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuite extends BaseCl
{
    @Test
    public void AddAccountPage()
    {
        //driver.findElement(By.cssSelector("#gbw > div > div > div.gb_9d.gb_i.gb_yg.gb_pg > div:nth-child(1) > a")).click();
        //driver.findElement(By.cssSelector("body > div.hercules-header.h-c-header.h-c-header--product-marketing-one-tier.header--desktop > div.h-c-header__bar > div.h-c-header__cta > ul.h-c-header__cta-list.header__nav--ltr > li.h-c-header__cta-li.h-c-header__cta-li--primary > a")).click();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"headingText\"]")).getText());
    }

    @Test
    public void FirstPage()
    {
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Abraam");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Joy");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abraamjoy");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("Abraamjoy69#");
        driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("Abraamjoy69#");
        //driver.findElement(By.xpath("//body[@id='yDmH0d']/div[@class='uc81Ff wKBl8c bbRbR RELBvb']/div[@id='initialView']/div[@class='bdf4dc']/div[@class='slptg']/div[@id='view_container']/form[@class='RFjuSb bxPAYd k6Zj8d']/div[@class='mbekbe bxPAYd']/div[@class='iUe6Pd Us7fWe JhUD8d']/div[@class='RCum0c']/div[@class='NTB7sf DbQnIe OcVpRe eO2Zfd']/div[@class='WBCose']/div[@class='U26fgb mUbCce fKz7Od M9Bg4d']/span[@class='xjKiLb']/span[@class='Ce1Y1c']/span[@class='JIzqne y7T4L']/*[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span")).click();
        driver.get("https://accounts.google.com/signup/v2/webgradsidvphone?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp" +);
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div/div[2]/div[1]/div/div[2]")).sendKeys("325454154325");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"headingText\"]")).getText());
    }
}
