package at.web.reusableClasses;

import static at.web.reusableClasses.DriverOptions.driver;

public class CloseBrowser{
    public static void closeBrowser(){
        driver.close();
        System.out.println("CloseBrowser");
    }
}
