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



}
