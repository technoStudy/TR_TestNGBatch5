package Gun03;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra url deki success yazısını doğrulayınız.
 */

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _03_ContactUsParameter extends BaseDriver {

    @Test
    @Parameters("mesaj") // xml de ki ile aynı name olmalı
    public void contactUs(String gelenMesaj){

        logTutma.info("contact us başladı");

        WebElement contactUsBtn=driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();

        WebElement enquiryArea=driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenMesaj);

        WebElement submitBtn=driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));

        logTutma.info("contact us bitti");
    }

}
