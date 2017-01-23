/** класс поиск ТВ
 **/

import org.testng.annotations.Test;

public class TVsearchTest {


    @Test
    public void tvSearch(){

        // открываем yandex
        Accessory.navigateYandex();

        // переход в расширенный поиск и задание параметров поиска: от 20000 рублей
        Accessory.searchByCategoties("20000");

        // проверка количества элементов на странице и поиск первого
        Accessory.checkElementsQuantityAndSearchFirst();

    }

}
