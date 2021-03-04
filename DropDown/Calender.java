package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Calender {

    public static void main( String[] args){

        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[6]/a")).click();

        driver.findElement(By.xpath("//div[@class='picker-second']/div")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
    }

}
