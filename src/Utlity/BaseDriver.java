package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri(){ // TearStart
       // System.out.println("başlangıç işlemleri yapılıyor"); //driver oluşturma, wait işlemleri,

        driver=new ChromeDriver();

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @AfterClass
    public void KapanisIslemleri(){  // TearDown
        //System.out.println("kapanış işlemleri yapılıyor"); //BekleKapat

        //logout
        Tools.Bekle(3);
        driver.quit();
    }

}


