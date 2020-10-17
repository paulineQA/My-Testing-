import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//public class LoginTest {
  //  public static void main(String[] args) {
    //    System.setProperty("webdriver.chrome.driver", "/Users/paulina/sda/chromedriver");
      //  ChromeDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver,10);

        //IMPLICIT WAIT
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  //      driver.get("https://ladybug-sda.herokuapp.com/#/");

        // driver.close();

     //   WebElement link = driver.findElementByLinkText("Logowanie");
//link.click();
        // 2. EXPLICIT WAIT
        // = bardziej pożądany- możemy ustawić, że element czeka do określonego warunku, bedzie dzialac tylko do jednego konkretnego elementu
        //czas zawsze w sekundach

        //**WebElement submitbutton = wait.until(
            //    ExpectedConditions.elementToBeClickable(
              //          By.cssSelector(
                //                ".btn.btn-primary")));


    //    String url= driver.getCurrentUrl();
    // assertThat(url).contains("register");
    //    }

//WebElement usernameInput = driver.findElementByName("username");
//usernameInput.sendKeys("admin");

//WebElement passwordInput = driver.findElementById("password");
//passwordInput.sendKeys("test");

//WebElement submitbutton = driver.findElementByClassName("btn-primary");

//submitbutton.click();



//Jeśli jest więcej buttonów na stronie---> szukasz u góry po class name
// w css identyfikatory ID- są poprzedzone haszem #
// nazwy klas w css- kropka .btn.btn-primary <-- dwie klasy, rozdzielone kropką
        // w css selector mozemy szukac dwóch klas na raz np.:
        //:WebElement submitbutton = driver.findElementByClassName("btn.btn.primary");


        // 2. explicit wait= bardziej pożądany- możemy ustawić, że element czeka do określonego warunku, bedzie dzialac tylko do jednego konkretnego elementu
        //czas zawsze w sekundach


// 3. --> fluent wait, polling every- domyslnie sprawdza co 500 milisekund




    //}

//}
