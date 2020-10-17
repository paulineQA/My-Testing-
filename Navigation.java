package pl.sda.testgda25.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    ChromeDriver driver;

    //konstruktor: metoda publiczna ktora ma taka sama nazwe jak klasa:
    public Navigation(ChromeDriver driver) {
        this.driver = driver;

    }
public void goToPage(String text) {
    WebElement link = this.driver.findElementByLinkText(text);
    link.click();

}
}
