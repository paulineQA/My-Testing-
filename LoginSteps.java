package pl.sda.testgda25.STEPS;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.sda.testgda25.pages.LOGIN;
import pl.sda.testgda25.pages.Navigation;

public class LoginSteps {

    String username;
    String password;
    ChromeDriver driver;
    WebDriverWait wait;
    Navigation navigation;
    LOGIN loginPage;

//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "/Users/paulina/sda/chromedriver");
//        this.driver = new ChromeDriver();
//        this.wait = new WebDriverWait(this.driver, 10);
//        this.navigation = new Navigation(this.driver);
//        this.loginPage = new LOGIN(this.driver, this.wait);
//        this.driver.get("https://facebook.com/");
//    }

    @Given("I am an admin")
    public void setUpUser() {
        this.username = "admin";
        this.password = "test";
    }


    @When("I sign in")
public void signIn() {
      this.navigation.goToPage("Logowanie");
      this.loginPage.signIn(this.username, this.password);



}

}
