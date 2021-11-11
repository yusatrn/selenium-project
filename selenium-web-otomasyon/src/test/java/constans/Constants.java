package constans;
import org.openqa.selenium.By;

import java.util.Random;

public class Constants {
    public static int i=1;
    private static Random r=new Random(70);
    private static int a=r.nextInt(10);
    public static final By MOVE= By.xpath("//*[@id=\"header__container\"]/div/header/div[2]/div/div[3]/div[2]/div[1]");
    public static final By LOG_IN= By.xpath("//*[@id=\"header__container\"]/div/header/div[2]/div/div[3]/div[2]/div[1]/div/div/div[3]");
    public static final By EMAIL_AREA= By.xpath("//*[@id=\"LoginEmail\"]");
    public static final By PASSWORD_AREA= By.xpath("//*[@id=\"Password\"]");
    public static final By SEARCH_AREA= By.xpath("//*[@id=\"search_input\"]");
    public static final By CLICK_BUTTON= By.xpath("//*[@id=\"fwds-container\"]/div/div/div/div[1]/a/span");
    public static final By CLICK_BUTTON_LOGIN= By.xpath("//*[@id=\"loginLink\"]");
    public static final By CLICK_DAHA_FAZLA=By.xpath("//*[@id=\"divModels\"]/div[7]/div/div[4]/a");
    public static final By CLICK_URUN=By.xpath("//*[@id=\"divModels\"]/div[7]/div/div[1]/div["+a+"]");
    public static final By BEDEN=By.xpath("//*[@id=\"option-size\"]/a["+i+"]");
    public static final By SEPETE_EKLE=By.xpath("//*[@id=\"pd_add_to_cart\"]");
    public static final By SEPETE_GIT=By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[4]/a");
    public static final By Fiyat=By.xpath("//*[@id=\"rightInfoBar\"]/div[1]/div/div[2]/div/div/div/span[2]");
    public static final By Sepet_Fiyat=By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/span");
    public static final By Sil=By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/a[1]");
    public static final By Onay=By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/a[1]");
    public static final By Bos=By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div/div/p[1]");
    public static final By Ekle=By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div/a[2]");
    public static final By SepetAdet = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[1]/div/span");
}
