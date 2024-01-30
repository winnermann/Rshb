package at.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static at.web.reusableClasses.DriverOptions.driver;

/**
 * Домашняя страница
 */
public class HomePage {

    /**
     * Надпись на странице "Россельхозбанк"
     */
    public static final WebElement textRosselhozbankOnHomePage = driver.findElement(By.xpath("//span[@class='font-sans font-medium text-white']"));

    /**
     * Иконка "Поиск" в виде Лупы
     */
    public static final WebElement searchIconOnHomePage = driver.findElement(By.xpath("//div[@class='h-full']"));

}
