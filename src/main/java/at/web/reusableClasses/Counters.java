package at.web.reusableClasses;

/**
 * Класс - Показания счетчика
 *
 * Хранит данные счетчика
 */
public class Counters {

    /**
     * Внутренняя переменная для теста куда сохранено количество результатов поиска
     */
    private static int searchRezultCounter;

    public static int getSearchRezultCounter() {
        return searchRezultCounter;
    }

    public static void setSearchRezultCounter(int searchRezultCounter) {
        Counters.searchRezultCounter = searchRezultCounter;
    }
}
