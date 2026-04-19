package vn.fpoly.testdem.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebdriverTest {


    WebDriver webDriver;
    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

    }

    @Test
    void testSteps() throws InterruptedException{
        webDriver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        webDriver.findElement(By.xpath("//*[@id=\"NewRegistration\"]")).click();
        Select select = new Select( webDriver.findElement(By.xpath("//*[@id=\"Salutation\"]")));
        select.selectByValue("Ms");
        webDriver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Do Huu");
        webDriver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Bao Nguyen");
        //*[@id="emailId"]
        webDriver.findElement(By.xpath("//*[@id=\"emailId\"]")).sendKeys("nguyendhb2@gmail.com");
        //*[@id="contactNumber"]
        webDriver.findElement(By.xpath("//*[@id=\"contactNumber\"]")).sendKeys("0928282811");
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("nguyen");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("1234");
        webDriver.findElement(By.xpath("//*[@id=\"first_form\"]/div/div[2]/center/input")).click();
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        //*[@id="menu"]/a/li
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a/li")).click();
        webDriver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        webDriver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("nguyen");
        webDriver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("1234");
        //*[@id="second_form"]/input
        webDriver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();



    }




}
