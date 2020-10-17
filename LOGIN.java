package pl.sda.testgda25.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LOGIN {
    ChromeDriver driver;
    WebDriverWait wait;
    public LOGIN(ChromeDriver driver1, WebDriverWait wait1) {
        this.driver = driver1;
        this.wait = wait1;
    }//szukanie po XPATH BUTTONA!!!:


        public void signIn(String username, String password) {
            WebElement submitButton = this.wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[contains(text(), 'Zaloguj')]")//<---TEST WĘZŁA, szuka słowa 'zaloguj'


                    )
            );
            WebElement usernameInput = this.driver.findElementByName("username");
            usernameInput.sendKeys(username);
            WebElement passwordInput = this.driver.findElementByName("password");
            passwordInput.sendKeys(password);
            submitButton.click();
        }

    }

