package at.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static at.web.reusableClasses.DriverOptions.driver;

/**
 * Страница с полем поиска
 */
public class SearchPage {

    /**
     * Поле "Поиск"
     */
    public static final WebElement searchFieldOnSearchPage = driver.findElement(By.xpath("//input[@name='search-bar-input']"));

}
