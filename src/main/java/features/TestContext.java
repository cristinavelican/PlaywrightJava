package features;

import com.microsoft.playwright.*;
import features.stepDefinitions.Booking;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class TestContext {
    private Page page;
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;

    public Browser getBrowser() {
        return browser;
    }

    public Page getPage() {
        if (page == null) {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions() // or firefox, webkit
                    .setHeadless(false)
                    .setSlowMo(100));

            if (browser == null) {
                throw new IllegalStateException("Browser initialization failed.");
            }

            context = browser.newContext();
            page = context.newPage();
            //throw new IllegalStateException("Page object is not initialized!");
        }
        return page;
    }

    @BeforeAll
    public void beforeAll(){
        System.out.println("Initializing Playwright and Browser...");
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions() // or firefox, webkit
                .setHeadless(false)
                .setSlowMo(100));

        if (browser == null) {
            throw new IllegalStateException("Browser initialization failed.");
        }

        context = browser.newContext();
        page = context.newPage();
    }

    @AfterAll
    public void afterAll(){
        browser.close();
        playwright.close();
    }

    public String getAlertText() {
        return null; // Add your logic if needed.
    }

    public void setAlertText(String alertText) {
        // Add your logic if needed.
    }
}
