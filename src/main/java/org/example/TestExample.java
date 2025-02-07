package org.example;
import com.microsoft.playwright.*;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.*;
import page.HomePage;

import static org.junit.jupiter.api.Assertions.*;

@UsePlaywright(TestExample.CustomOptions.class)
public class TestExample {

    public static class CustomOptions implements OptionsFactory {
        @Override
        public Options getOptions() {
            return new Options()
                    .setHeadless(false);
        }
    }

    @Test
    void shouldSearchWiki(Page page) {
        page.navigate("https://www.wikipedia.org/");
        page.locator("input[name=\"search\"]").click();
        page.locator("input[name=\"search\"]").fill("playwright");
        page.locator("input[name=\"search\"]").press("Enter");
        assertEquals("https://en.wikipedia.org/wiki/Playwright", page.url());
    }

    @Test
    void bookARoom(Page page) throws InterruptedException {
        HomePage homePage = new HomePage(page);
        homePage.navigateToHomePage();
        homePage.goToRoomsCategory();
        homePage.clickOpenBookButton();
        Thread.sleep(5000);
    }

}


