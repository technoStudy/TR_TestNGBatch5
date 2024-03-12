package Gun04;


import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımız Search fonksiyonunu
 * mac,ipod ve samsung için Dataprovider ile yapınız.
 */

public class _05_Soru extends BaseDriver {

    @Test(dataProvider = "getData")
    public void searchFunction(String arananKelime){

        WebElement searchInput=driver.findElement(By.name("search"));
        searchInput.clear();
        searchInput.sendKeys(arananKelime+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption']> h4"));

        for(WebElement e: captions)
        {
            System.out.println("e.getText() = " + e.getText());
            Assert.assertTrue(e.getText().toLowerCase().contains
                    (arananKelime.toLowerCase()),"Arana kelime bulunmadı");
        }

    }

    @DataProvider
    Object[] getData(){
        Object[] aranacaklar={"mac","ipod","samsung"};

        return aranacaklar;
    }



}
