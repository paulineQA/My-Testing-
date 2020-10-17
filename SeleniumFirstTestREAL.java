package PL.SDA.TESTGDA25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumFirstTestREAL {
        ChromeDriver driver;
        WebDriverWait wait;


        ///ANOTACJA 1 :
        @BeforeMethod
       void setUp(){
           System.setProperty("webdriver.chrome.driver", "/Users/paulina/sda/chromedriver");
           this.driver = new ChromeDriver();
           this.wait = new WebDriverWait(this.driver, 10);

       }

       // ANOTACJA 2 - Wstrzykujemy dodatkową funkcjonalność,Spięcie frameworkiem test-engine
       @AfterMethod
       void tearDown (){
this.driver.close();

       }
       @Test
       void loginWithCorrectCredentials() {
       }
void loginWithIncorrectCredentials(){

}

    }


