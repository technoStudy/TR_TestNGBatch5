package Gun01;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.

 */

public class _08_SubscribeNewsLetter extends BaseDriver {

    @Test
    public void subscribeFunctionYes(){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(By.xpath("//input[@value='1']"));
        subscribeYes.click();

        WebElement continueButton=driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        WebElement msgLabel= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }

}
