package login;

import base.BasePage;
import base.BaseTest;
import constans.Constants;
import org.junit.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.Sleeper;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    BasePage basePage;
    final static Logger logger = Logger.getLogger(LoginPageTest.class);
    @Before
    public void before(){
        loginPage= new LoginPage(getWebDriver());
    }
    @Test
    public void test(){
        logger.info("Yönlendirilen Sayfa : "+getWebDriver().getCurrentUrl());
        String sayfa=getWebDriver().getCurrentUrl();
        if(sayfa.equals("https://www.lcwaikiki.com/tr-TR/TR")) {
            loginPage.moveToLogIn().clickLogIn().sendEmail().sendPassword().SubmitButton();
            sayfa=getWebDriver().getCurrentUrl();
            if (sayfa.equals("https://www.lcwaikiki.com/tr-TR/TR")) {
                loginPage.Search_click().search()
                        .clikButton().Kaydır().clickDaha().clickUrun();
                logger.info((loginPage.Fiyat()));
                String fiyat=loginPage.Fiyat();
                loginPage.beden().SepetEkle().SepeteGit();
                logger.info(loginPage.SepetFiyat());

                if (fiyat.equals(loginPage.SepetFiyat())){
                    logger.info("Fiyatlar Aynı");
                    loginPage.Ekle();

                }
                else {
                    logger.info("Fiyatlar Farklı");
                    loginPage.Ekle();
                }

                try{
                    Thread.sleep(5000);
                }
                catch(InterruptedException ie){
                }
                logger.info("Sepet Adet: "+loginPage.SepetAdet());
               boolean adet=loginPage.SepetAdet().contains("2");
                if (adet) {
                    logger.info("Sepette 2 adet ürün bulunuyor");
                }
                else {
                    logger.info("Sepette 2 adet ürün yok");
                }

                String bos=loginPage.Sil();
                if (bos.contains("Sepetinizde ürün bulunmamaktadır.")){
                    logger.info("Sepetinizde ürün bulunmamaktadır.");
                }
                else {
                    logger.info("Silinirken Hata oluştu");
                }

            }
            else {
                logger.info("Hatalı Giriş Yapıldı");
            }
        }
    }
    @After
    public void after(){
        tearDown();
        logger.info("Yuşa Turan");
    }
}
