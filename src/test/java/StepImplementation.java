import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;


public class StepImplementation extends BaseTest {

    Random r = new Random();
    String beforeDepartureTime, afterDepartureTime, beforeArrivalTime, afterArrivalTime;
    @Step("<x> saniye kadar bekle")
    public void waitForSeconds(int x) throws InterruptedException {
        Thread.sleep(1000*x);
    }

    @Step("Tanıtım ekranı geç")
    public void Skip(){
        MobileElement element = appiumDriver.findElement(By.id("com.m.qr:id/skip_button"));
    if (element.isDisplayed()){
        System.out.println("Tanım ekranı görünür oldu");
        element.click();
        element.click();
        appiumDriver.findElement(By.id("com.m.qr:id/push_consent_allow"));
    }else {
        System.out.println("Tanım ekranı görünür olmadı");
    }

    }
    @Step("<id> id li element <text> text değerini içeriyor mu  kontrol et")
    public void assertByid(String id ,String text) {
        MobileElement element = appiumDriver.findElement(By.id(id));
        Assert.assertTrue(element.getText()+"text değeri verilen değer birbirini tutmuyor",element.getText().equals(text));
    }

    @Step("<id> li elemente tıkla")
    public void clickByid(String id){
        appiumDriver.findElement(By.id(id)).click();
    }

    @Step("<xpath> li elemente tıkla")
    public void clickByxpath(String xpath){
        appiumDriver.findElement(By.xpath(xpath)).click();

    }
    @Step("<xpath> li elemente <value> text değerini yaz")
    public void sendKeyByxpath(String xpath,String value){
        MobileElement element = appiumDriver.findElement(By.xpath(xpath));
        element.clear();
        element.sendKeys();
    }

    @Step("<id> li elemente <value> text değerini yaz")
    public void sendKeyByid(String id,String value){
        MobileElement element = appiumDriver.findElement(By.id(id));
        element.clear();
        element.sendKeys();
    }

    @Step("Bugünün tarihi + 7 gün olarak bir gidiş tarihi seç")
    public void plus7Days() {
        new Actions(appiumDriver)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Step("<xpath> li listede random değer seç <departure> ve <arrival> değerlerini tut")
    public void randomSelect(String xpath, String departureValue, String arrivalValue) {

        int random = r.nextInt(4);
        if (random==0){
            random = random+1;
        }
        System.out.println("random: "+random);
        MobileElement departure = appiumDriver.findElement(By.xpath("("+xpath+")["+random+"]/"+departureValue+""));
        beforeDepartureTime = departure.getAttribute("text");
        MobileElement arrival = appiumDriver.findElement(By.xpath("("+xpath+")["+random+"]/"+arrivalValue+""));
        beforeArrivalTime = arrival.getAttribute("text");
        MobileElement element = appiumDriver.findElement(By.xpath("("+xpath+")["+random+"]"));
        element.click();
    }

    @Step("<departureValue> ile <arrivalValue> uçuş detayları ekranı değerleri")
    public void lastFlyDetails(String departureValue, String arrivalValue) {
        MobileElement departure = appiumDriver.findElement(By.xpath(departureValue));
        afterDepartureTime = departure.getAttribute("text");

        MobileElement arrival = appiumDriver.findElement(By.xpath(arrivalValue));
        afterArrivalTime = arrival.getAttribute("text");

    }

    @Step("Uçuş seçim ekranındaki uçuş saati kontrolü")
    public void compareFlyHours() {
        Assert.assertEquals("Kalkış saatlerinin ilk ve son değerleri eşit değil!",beforeDepartureTime,afterDepartureTime);
        Assert.assertEquals("Varış saatlerinin ilk ve son değerleri eşit değil!",beforeArrivalTime,afterArrivalTime);
    }



}
