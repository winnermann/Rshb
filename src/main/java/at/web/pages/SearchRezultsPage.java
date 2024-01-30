package at.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static at.web.reusableClasses.DriverOptions.driver;

/**
 * Страница с результатами поиска
 */
public class SearchRezultsPage {

    /**
     * Результаты поиска
     */
    public static final List<WebElement> searchRezultsOnSearchRezultsPage = driver.findElements(By.xpath("//a[@class='hover:text-primary-main font-light']"));
}
