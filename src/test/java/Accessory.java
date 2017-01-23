/** вспомогательный класс
 **/

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Accessory {


    public static void navigateYandex(){

        // поключение к webdriver
        Locators.getDriver();
        //разворачивание браузера во весь экран
        Locators.driver.manage().window().maximize();
        //переход по указанному адресу
        Locators.driver.get("http://yandex.ru/");
        //ожидание загрузки
        Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // нажатие на вкладку "маркет"
        Locators.getMarketButton().click();
        // переход в раздел "электроника"
        Locators.getElectroButton().click();


    }
    public static void checkElementsQuantityAndSearchFirst(){
        // Проверка количества элементов на странице (должно быть 12)
        List<WebElement> list = Locators.getAllFoundElements();
        Assert.assertEquals(12, list.size());

        // запоминаем товар в переменную firstElementName и ищем его в маркете
        String firstElementName = Locators.getFirstFoundElementName();

        Locators.getSearchField().sendKeys(firstElementName);
        Locators.getSearchButton().click();

        //проверка выбранного товара с найденным в поиске
        String foundElement = Locators.getFoundElementName();
        Assert.assertEquals(firstElementName, foundElement);


    }

    public static void setPrice(String pr){
        Locators.getPriceField().click();
        Locators.getPriceField().clear();
        Locators.getPriceField().sendKeys(pr);
    }

    public static void searchByCategoties(String price){

        if (price.equals("20000")){
            // переход в раздел "телевизоры"
            Locators.getTvButton().click();
            setPrice(price);
            // выбор производители Samsung и LG
            Locators.getCheckBoxSamsung().click();
            Locators.getCheckBoxLG().click();

            // Нажать кнопку Применить
            Locators.getApplyButtonTV().click();
        }
        else {
            // переход в раздел "наушники"
            Locators.getHpButton().click();
            setPrice(price);
            // выбор производителя Beats
            Locators.getCheckBoxBeats().click();

            // Нажать кнопку Применить
            Locators.getApplyButtonHP().click();
        }
    }

    // отключение драйвера после прохождения тестов
        /*@AfterMethod
        public void tearDown(){
            Locators.driver.quit();
        }
        */

}
