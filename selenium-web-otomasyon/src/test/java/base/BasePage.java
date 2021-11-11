package base;
import login.LoginPage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasePage {
    WebDriver driver=null;
    WebDriverWait wait=null;

    public  BasePage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver,60);

    }
    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    public void sendKey(By by,Keys a){
        findElement(by).sendKeys(a);
    }
    public void sendEkle(By by){
        findElement(by).clear();
    }
    public void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public String getText(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by).getText();
    }

    public void scroll(By by){

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", findElement(by));
    }
    public String Anasayfa(){
       String sayfa= driver.getTitle();
        return sayfa;
    }

}
