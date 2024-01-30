package at.web.steps;

import at.web.reusableClasses.Counters;
import at.web.reusableClasses.Logs;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static at.web.pages.HomePage.searchIconOnHomePage;
import static at.web.pages.SearchPage.searchFieldOnSearchPage;
import static at.web.pages.SearchRezultsPage.searchRezultsOnSearchRezultsPage;


public class Steps {

    @Step("Шаг: Кликнуть на Иконка 'Поиск' в виде Лупы")
    public static void clickSearchIconOnHomePage(){
        System.out.println(" ");
        System.out.println("Шаг: Кликнуть на Иконка 'Поиск' в виде Лупы");

        /**
         * Кликнуть на Иконка "Поиск" в виде Лупы
         */
        searchIconOnHomePage.click();

        /**
         * Log - Выдает в консоль результат прохождения шага
         * OK - шаг пройден успешно
         * FAIL - шаг пройден неуспешно
         */
        Logs.stepResultLog("Поле поиска отобразилось на странице : ", searchFieldOnSearchPage.isDisplayed(), "Поле поиска доступно для ввода : ", searchFieldOnSearchPage.isEnabled());
        assertTrue(searchFieldOnSearchPage.isDisplayed(), "Поле поиска не отобразилось на странице");
        assertTrue(searchFieldOnSearchPage.isEnabled(), "Поле поиска недоступно для ввода");

    }

    @Step("Шаг: Ввести запрос 'Депозиты' в поле поиска")
    public static void enterTextDepositsInSearchFieldOnSearchPage(){

        System.out.println(" ");
        System.out.println("Шаг: Ввести запрос 'Депозиты' в поле поиска");

        /**
         * Ввести запрос 'Депозиты' в поле поиска
         */
        searchFieldOnSearchPage.sendKeys("Депозиты");

        /**
         * Log - Выдает в консоль результат прохождения шага
         * OK - шаг пройден успешно
         * FAIL - шаг пройден неуспешно
         */
        Logs.stepResultLog("В поле поиска введён запрос: ", searchFieldOnSearchPage.getAttribute("value"), "Депозиты");
        assertEquals(searchFieldOnSearchPage.getAttribute("value"), "Депозиты", "Ожидаемый запрос 'Депозиты' не введен в поле поиска");


    }

    @Step("Шаг: Нажать клавишу 'ENTER'")
    public static void pressEnterButton(){

        System.out.println(" ");
        System.out.println("Шаг: Нажать клавишу 'ENTER'");
        searchFieldOnSearchPage.sendKeys(Keys.ENTER);

        /**
         * Во внутреннюю переменную для теста сохранено количество результатов поиска
         */
        Counters.setSearchRezultCounter(searchRezultsOnSearchRezultsPage.size());

        /**
         * Log - Выдает в консоль результат прохождения шага
         * OK - шаг пройден успешно
         * FAIL - шаг пройден неуспешно
         */
        Logs.stepResultLog("Количество результатов поиска: ", Counters.getSearchRezultCounter(), 99);
        assertEquals(Counters.getSearchRezultCounter(), 99, "Количество результатов поиска не соответствует ожидаемому");

    }
}