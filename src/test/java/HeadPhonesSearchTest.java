/** класс поиск наушников
 **/

import org.testng.annotations.Test;

public class HeadPhonesSearchTest {

    @Test
    public void headPhonesSearch(){

        // открываем yandex
        Accessory.navigateYandex();

        // переход в расширенный поиск и задание параметров поиска: от 5000 рублей
        Accessory.searchByCategoties("5000");

        // проверка количества элементов на странице и поиск первого
        Accessory.checkElementsQuantityAndSearchFirst();


    }


}
