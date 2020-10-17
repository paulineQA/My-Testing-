package pl.sda.testgda25.STEPS;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FacebookSteps {
        ChromeDriver driver;
        WebDriverWait wait;

        @Before
        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "/Users/paulina/sda/chromedriver");
            this.driver = new ChromeDriver();
            this.wait = new WebDriverWait(this.driver, 10);

            this.driver.get("https://facebook.com/");


        }
        @When("I login to Facebook")
        public void loginToFacebook() {
            WebElement acceptCookiesButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@title='Akceptuj wszystkie']")
                            // po ID(które sie nie zmienia i jest niezalezne od jezyka systemu operacyjnego) [@data-testid='cookie-policy-banner-accept'])"<-- skopiowane z "zbadaj"


                    )
            );
            acceptCookiesButton.click();

            WebElement usernameInput = driver.findElementById("email");
            usernameInput.sendKeys("pauliisss@op.pl");

            WebElement passwordInput = driver.findElementById("pass");
            passwordInput.sendKeys("Bf65ccc111.");

            WebElement ZalogujSięButton = driver.findElementByName("login");
            ZalogujSięButton.click();



        }


}
