package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _07_Assertions {

    @Test
    public void equalsOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        // Actual(oluşan), Expected (Beklenen), Mesajı (opsiyonel)
        Assert.assertEquals(s1,s2, "oluşan la beklenen aynı değil"); //aem
    }

    @Test
    public void NotEqualsOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        // Actual(oluşan), Expected (Beklenen), Mesajı (opsiyonel)
        Assert.assertNotEquals(s1,s2, "oluşan la beklenen farklı değil"); //aem
    }

    @Test
    public void TrueOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";

        // Actual(oluşan), Expected (Beklenen), Mesajı (opsiyonel)
        Assert.assertTrue(s1.equals(s2), "oluşan la beklenen aynı değil"); //aem
    }

    @Test
    public void TrueOrnek2(){
        int s1=5;
        int s2=5;

        // Actual(oluşan), Expected (Beklenen), Mesajı (opsiyonel)
        Assert.assertTrue(s1 == s2, "oluşan la beklenen aynı değil"); //aem
    }



}
