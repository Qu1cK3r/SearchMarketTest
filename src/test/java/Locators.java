import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.*;

/**
 *  класс локаторов
 */
public class Locators {

    static WebDriver driver ;
    private static List<WebElement> list;
    private static WebElement firstFoundElement;
    private static WebElement searchField;
    private static WebElement searchButton;
    private static WebElement foundElement;
    private static WebElement tvButton;
    private static WebElement hpButton;
    private static WebElement marketButton;
    private static WebElement electroButton;
    private static WebElement priceField;
    private static WebElement applyButtonTV;
    private static WebElement applyButtonHP;
    private static WebElement checkBoxSamsung;
    private static WebElement checkBoxLG;
    private static WebElement checkBoxBeats;


    // установка webdriver по указанному пути
    public static void getDriver() {
        File file = new File("C:/Program Files/Mozilla Firefox/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
        driver = new FirefoxDriver();
    }

    // получение списка всех найденныйх элементов на странице
    public static List<WebElement> getAllFoundElements(){
          list = driver.findElements(By.cssSelector(".n-snippet-card.snippet-card.clearfix.i-bem.n-snippet-card_js_inited"));
        return list;
    }

    // получение первого найденного элемента. Метод возвращает название
    public static String getFirstFoundElementName() {
        firstFoundElement = getAllFoundElements().get(0).findElement(By.cssSelector(".snippet-card__header-text"));
        return firstFoundElement.getAttribute("textContent");
    }
    // строка поиска
    public static WebElement getSearchField() {
         searchField = driver.findElement(By.id("header-search"));
        return searchField;
    }

    //кнопка поиска
    public static WebElement getSearchButton() {
         searchButton = driver.findElement(By.xpath("html/body/div[1]/div[1]/noindex/div/div/div[2]/div/div[1]/form/span[2]/button"));
        return searchButton;
    }

    // найденный в конце элемент. Метод возвращает название
    public static String getFoundElementName() {
        foundElement = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/div[1]/div/h1"));
        return foundElement.getAttribute("textContent");
    }

    //  раздел ТВ
    public static WebElement getTvButton() {
        tvButton = driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div/div[3]/div/a[1]"));
        return tvButton;
    }

    // раздел наушники
    public static WebElement getHpButton() {
        hpButton = driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div/div[2]/div/a[1]"));
        return hpButton;
    }

    // поле цена
    public static WebElement getPriceField() {
        priceField = driver.findElement(By.id("glf-pricefrom-var"));
        return priceField;
    }

    // список чебоксов производителей
    public static WebElement getCheckBoxSamsung() {
        checkBoxSamsung = driver.findElement(By.id("glf-1801946-1871499"));
        return checkBoxSamsung;
    }
    public static WebElement getCheckBoxLG() {
        checkBoxLG = driver.findElement(By.id("glf-1801946-1871447"));
        return checkBoxLG;
    }
    public static WebElement getCheckBoxBeats() {
        checkBoxBeats = driver.findElement(By.id("glf-1801946-8455647"));
        return checkBoxBeats;
    }

    // кнопки подтверждения поиска
    public static WebElement getApplyButtonTV() {
        applyButtonTV = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
        return applyButtonTV;
    }
    public static WebElement getApplyButtonHP() {
        applyButtonHP = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
        return applyButtonHP;
    }

    // вкладка маркет
    public static WebElement getMarketButton() {
       marketButton = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/div/a[2]"));
        return marketButton;
    }

    // вкладка электроника
    public static WebElement getElectroButton() {
       electroButton = driver.findElement(By.xpath("html/body/div[1]/div[2]/noindex/ul/li[1]/a"));
        return electroButton;
    }
}
