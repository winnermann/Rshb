package testCasesRun;

import at.web.reusableClasses.CloseBrowser;
import at.web.reusableClasses.Preconditions;
import at.web.steps.Steps;
import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Epic(value = "Тест-кейсы. Проверки поисковых запросов.")
@Feature(value = "Сценарий: Проверка поиска по слову 'Депозиты' (позитивный тест-кейс).")
@Owner("Тестировщик Россельхозбанка")
@Link(name = "TMS_Link(вымышленная). Сценарий: Проверка поиска по слову 'Депозиты' (позитивный тест-кейс).", url = "https://tms_name.int.rshb.ru/pages/viewpage.actions?pageID=000000000")
public class RshbTest extends Steps {

    @BeforeTest
    public static void preconditions() {
        System.out.println();
        System.out.println();
        System.out.println("Start test: " + Thread.currentThread().getStackTrace()[1].getFileName());
        System.out.println("Запущен Сценарий: Проверка поиска по слову 'Депозиты' (позитивный тест-кейс)");
        System.out.println("TMS_Link(вымышленная): https://tms_name.int.rshb.ru/pages/viewpage.actions?pageID=000000000");
        Preconditions.preconditions1();
    }

    @Test(testName = "Шаг: Кликнуть на Иконка 'Поиск' в виде Лупы", priority = 1)
    public static void step_1(){
        clickSearchIconOnHomePage();

    }

    @Test(testName = "Шаг: Ввести запрос 'Депозиты' в поле поиска", priority = 2)
    public static void step_2(){
        enterTextDepositsInSearchFieldOnSearchPage();

    }

    @Test(testName = "Шаг: Нажать клавишу 'ENTER'", priority = 3)
    public static void step_3(){
        pressEnterButton();

    }

    @AfterTest
    void close_Browser(){
        CloseBrowser.closeBrowser();
        System.out.println(" ");
        System.out.println("Завершён Сценарий: Проверка поиска по слову 'Депозиты' (позитивный тест-кейс)");
        System.out.println("Stop test: " + Thread.currentThread().getStackTrace()[1].getFileName());

    }

}
