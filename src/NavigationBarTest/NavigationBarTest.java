package NavigationBarTest;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NavigationBarTest extends BaseDriver {
    @Test
    void test1(){
        login();

        List<WebElement> tabs = driver.findElements(By.cssSelector("ul[class='nav navbar-nav'] > li"));

        // Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
        List<String> menuTexts = new ArrayList<>(List.of("Desktops", "Laptops & Notebooks", "Components", "Tablets", "Software", "Phones & PDAs", "Cameras", "MP3 Players"));


        for (WebElement t : tabs){
            Assert.assertTrue(t.isDisplayed());
            Assert.assertTrue(menuTexts.contains(t.getText()));
        }

    }
}
