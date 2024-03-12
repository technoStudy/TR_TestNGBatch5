package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider {

    @Test(dataProvider = "datalarim")
    public void searchText(String gelenKelime){
        System.out.println("gelenKelime = " + gelenKelime);
    }

    @DataProvider
    Object[] datalarim(){
        Object[] aranacaklar={"mac","samsung","laptop"};

        return aranacaklar;
    }


}
