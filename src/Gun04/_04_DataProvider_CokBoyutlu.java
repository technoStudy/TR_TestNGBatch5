package Gun04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _04_DataProvider_CokBoyutlu {


    @Test(dataProvider = "datalarim")
    public void searchText(String username,String sifre) {
        System.out.println(username+" "+sifre);
    }

    @DataProvider
    Object[][] datalarim() {
        Object[][] kullaniciVeSifre =
                {
                        {"ismet", "1234"},
                        {"mehmet", "44444"},
                        {"Ayşe", "6666"},
                        {"Serkan", "9999"},
                        {"Ali", "ddddd"}
                };

        return kullaniciVeSifre;
    }


}
