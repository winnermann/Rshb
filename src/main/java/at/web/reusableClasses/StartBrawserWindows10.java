package at.web.reusableClasses;

import at.web.config.UserConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

import static at.web.reusableClasses.DriverOptions.options;
import static at.web.reusableClasses.DriverOptions.driver;

public class StartBrawserWindows10{

    public static void startBrowserChrome() {
        System.out.println("Стартует: Browser Chrome");

        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(UserConfig.URL);

    }

}
