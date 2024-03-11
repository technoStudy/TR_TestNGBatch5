package Gun03;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */


import Utlity.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _05_SearchCrossBrowser extends BaseDriverParameter {

    @Test
    @Parameters("searchText")
    public void SearchFunction(String arananKelime){
        WebElement searchInput=driver.findElement(By.name("search"));
        searchInput.sendKeys(arananKelime+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption']> h4"));

        for(WebElement e: captions)
        {
            System.out.println("e.getText() = " + e.getText());
            Assert.assertTrue(e.getText().toLowerCase().contains
                    (arananKelime.toLowerCase()),"Arana kelime bulunmadı");
        }

    }




}
