package login;
import base.BasePage;
import base.BaseTest;
import constans.Constants;
import org.openqa.selenium.*;

import org.apache.log4j.Logger;

import java.lang.ref.Cleaner;

import static constans.Constants.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage moveToLogIn(){
        hoverElement(MOVE);
        return this;
    }
    public LoginPage clickLogIn(){
        click(LOG_IN);
        return this;
    }  public LoginPage sendEmail(){
        sendKeys(EMAIL_AREA,"yusatrn@windowslive.com");
        return this;
    }  public LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA,"deneme123");
        return this;
    }  public LoginPage SubmitButton(){
        click(CLICK_BUTTON_LOGIN);
        return this;
    }  public LoginPage search(){
        sendKeys(SEARCH_AREA,"pantolan");
        return this;
    }
    public LoginPage clikButton(){
        sendKey(SEARCH_AREA,Keys.ENTER);
        return this;
    }
    public LoginPage Kaydır(){
        scroll(CLICK_DAHA_FAZLA);
        return this;
    }
    public LoginPage clickDaha(){
        click(CLICK_DAHA_FAZLA);
        return this;
    }
    public LoginPage clickUrun(){
     click(CLICK_URUN);
     return this;
    }
    public LoginPage beden(){
       String kontrol= BaseTest.getWebDriver().findElement(BEDEN).getClass().getName();
        Logger.getLogger(kontrol);

            click(BEDEN);

        return this;

    }
    public LoginPage SepetEkle(){
        click(SEPETE_EKLE);
        return this;
    }
    public LoginPage SepeteGit(){
        click(SEPETE_GIT);
        return this;
    }
    public String Fiyat(){
     return  BaseTest.getWebDriver().findElement(Fiyat).getText();
    }
    public String SepetFiyat(){
       return
        BaseTest.getWebDriver().findElement(Sepet_Fiyat).getText();
    }
    public LoginPage Ekle(){
        click(Ekle);


        return this;
    }
    public String Sil(){
        click(Sil);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(Onay);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getText(Bos);

    }
    public String SepetAdet()
    {
        return BaseTest.getWebDriver().findElement(SepetAdet).getText();

    }

    public LoginPage Search_click(){
        click(SEARCH_AREA);
        return this;
    }
}
