package ru.begetTech;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class FirstTest {

    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ilyas\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void firstTest() {
        driver.get("http://u920152e.beget.tech/");

        driver.findElement(By.name("auth_email")).sendKeys("test@gmail.com");

        driver.findElement(By.name("auth_pass")).sendKeys("Test1234");

        driver.findElement(By.className("form_auth_button")).click();

        driver.findElement(By.cssSelector("[value=\"18\"]")).click();

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("p")));

    }
    @After
    public void close() {
        driver.quit();
    }

}
