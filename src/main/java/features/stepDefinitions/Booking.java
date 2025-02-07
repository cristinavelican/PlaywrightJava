package features.stepDefinitions;

import com.microsoft.playwright.Page;
import factory.BasePageFactory;
import features.TestContext;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class Booking {

    private BasePageFactory factory;
    private HomePage homePage;
    private Page page;
    private final TestContext testContext;  // Injected through constructor

    // Constructor dependency injection
    public Booking(TestContext testContext) {
        this.testContext = testContext;
    }

    // Make sure the page is initialized before running any tests
    @Before
    public void setUp() {
        page = testContext.getPage();  // Fetch the page from TestContext (must be initialized)
        if (page == null) {
            throw new RuntimeException("Page object is not initialized!");
        }

        factory = new BasePageFactory(page);  // Initialize factory with the page
        homePage = factory.getPage(HomePage.class);  // Get the HomePage
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        homePage.navigateToHomePage();  // Navigate to home page using the homePage object
    }

    @When("I browse through the page")
    public void i_browse_through_the_page() {
        homePage.goToRoomsCategory();  // Perform browsing actions
    }

    @Then("I have the option to book a room")
    public void i_have_the_option_to_book_a_room() {
        // homePage.assertBookButtonDisplayed();  // Uncomment and implement as needed
    }

}
