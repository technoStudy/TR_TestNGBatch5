package Gun05;


/*
  Senaryo;
  1- Brands menusune gidiniz.
  2- Burada her bir markanın üstünde yer alan harf ile başladığını doğrulayınız
*/


import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _01_Soru extends BaseDriver {

    @Test
    public void brandsValidation(){
       WebElement brandsLink=driver.findElement(By.linkText("Brands"));
       brandsLink.click();

       List<WebElement> harfler=driver.findElements(By.cssSelector("[id='content'] > h2"));
       List<WebElement> markalar=driver.findElements(By.cssSelector("[id='content'] > div"));

        for (int i = 0; i < harfler.size(); i++) {

            // Şu andaki harfin altındaki markaları aldım
            List<WebElement> harfinMarkalari=markalar.get(i).findElements(By.tagName("div"));
            //elementin içinde element ararken XPATH kullanılamaz, çünkü o TÜM sayfada arar

            for(WebElement marka : harfinMarkalari) {
                System.out.println(harfler.get(i).getText().charAt(0)+" "+ marka.getText());
                Assert.assertEquals(harfler.get(i).getText().charAt(0), marka.getText().charAt(0));

               // Assert.assertTrue(marka.getText().startsWith(harfler.get(i).getText()));
                //"A" string -> charAt 'A'  ile 'A' char
            }
        }
    }


}
