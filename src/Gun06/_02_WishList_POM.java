package Gun06;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _02_WishList_POM extends BaseDriver {

    @Test
    public void addToWishList(){
        _01_PlaceOrder_Elementleri poe=new _01_PlaceOrder_Elementleri();
        _02_WishList_Elements wle=new _02_WishList_Elements();

        poe.searchBox.sendKeys("ipod" + Keys.ENTER);

        int randomSecim= Tools.randomGenerator(wle.wishButtons.size());
        String wishItemText=wle.productNameList.get(randomSecim).getText();

        wle.wishButtons.get(randomSecim).click();
        wait.until(ExpectedConditions.elementToBeClickable(wle.wishListLink));
        wle.wishListLink.click();

        boolean bulundu= Tools.ListContainsString(wle.wishNameList, wishItemText);
        Assert.assertTrue(bulundu,"Wish Listte eleman bulunamadı");
    }




}
