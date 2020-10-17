import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrationtest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/paulina/sda/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);

         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://ladybug-sda.herokuapp.com/#/");
         //driver.close();
        WebElement link = driver.findElementByLinkText("Rejestracja");
        link.click();


        WebElement submitbutton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector(
                                ".btn.btn-primary")
                )
        );

        WebElement form= driver.findElementByName("registrationForm");
        WebElement usernameinput = form.findElement(By.id("username"));
        usernameinput.sendKeys("maciej12345");

        WebElement passwordinput = form.findElement(By.id("password"));
        passwordinput.sendKeys("ADMIN");

        WebElement repeatedpasswordinput = form.findElement(By.id("repeatedPassword"));
        repeatedpasswordinput.sendKeys("PAULINKA");

        WebElement firstName = form.findElement(By.id("firstName"));
        firstName.sendKeys("PAULINA ANNA ");

        //(( import np list z javy --> alt +enter)))
        ///!!!!! wypelnianie wszystkeigo!!!--> źle zrobione, popraw!!
       //// List<WebElement> input = driver.findElementsByTagName("input")
        //        input.get(0)[Method].sendkeys("asd")
        ///for(webElement el: input) {
           /// el.sendKeys:"asd"}
        }


    }






