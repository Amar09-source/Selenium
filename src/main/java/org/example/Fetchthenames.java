package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Fetchthenames {
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

//        WebElement mobile=driver.findElement(By.xpath("//div[@class='nav-div']//a[text()='Mobiles']"));
//        mobile.click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();

        List<WebElement> products = driver.findElements(By.cssSelector("div.s-main-slot div.s-result-item"));
        System.out.println(products.size());
        for(WebElement p:products)
        {
           // System.out.println(p.getText());
            try {
                String title = p.findElement(By.cssSelector("h2 span")).getText();
                String price = p.findElement(By.cssSelector("span.a-price-whole")).getText();
                System.out.println("Name: " + title);
                System.out.println("Price: ₹" + price);
                System.out.println("--------------------------");
            } catch (Exception e) {
                // Some items may not have price or title
                continue;
        }


    }
}}
