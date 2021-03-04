package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        //FROM
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(3000);

        //TO
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();

        //CALENDER
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[6]/a")).click();
//        Thread.sleep(3000);

        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();

        //CHOOSE HOW MANY ADULT
        driver.findElement(By.id("divpaxinfo")).click();

        WebElement staticDropDown1 = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
        Select dropDown1 = new Select(staticDropDown1);
        dropDown1.selectByIndex(3);
//        System.out.println(dropDown1.getFirstSelectedOption().getText());

        // HOW MANY CHILDREN
        WebElement staticDropdown2 = driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
        Select dropDown2 = new Select(staticDropdown2);
        dropDown2.selectByVisibleText("3");
//        System.out.println(dropDown2.getFirstSelectedOption().getText());

//        driver.findElement(By.id("divpaxinfo")).click();

        //CURRENCY
        WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(currency);
        dropdown.selectByVisibleText("USD");

        //CHECKBOX
//        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
//        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();


        //SEARCH
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();



//          ctl00_mainContent_ddl_originStation1_CTXT  //id
//
//          //a[@value='BLR'] //xpath
//
//         //td[@class='mapbg']//a[@value='DEL'] //xpath
//
//          .ui-state-default.ui-state-highlight.ui-state-active	//css
//
//           divpaxinfo  //id
//
//
//          ctl00_mainContent_chk_StudentDiscount
//
//
//           ctl00_mainContent_chk_StudentDiscount         //ID















//        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//       // System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
//        //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
//
//        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


    }


}
