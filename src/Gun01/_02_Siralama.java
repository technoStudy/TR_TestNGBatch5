package Gun01;

import org.testng.annotations.Test;

public class _02_Siralama {

    @Test(priority = 1)
    public void DriverOluturmaIslemleri()  // öncelik ayarı yapılmazsa alfabetik çalışıyor
    {
        System.out.println("Driver Oluturma Islemleri");
    }

    @Test(priority = 2)
    public void LoginTesti()  // TC_Kimlik_Dogrulama_01
    {
        System.out.println("Login Testi");
    }

    @Test(priority = 3)
    public void SepeteUrunEkleme()
    {
        System.out.println("Sepete Urun Ekleme");
    }

    @Test(priority = 4)
    public void DriverKapatmaIslemleri()
    {
        System.out.println("Driver Kapatma Islemleri");
    }

}
