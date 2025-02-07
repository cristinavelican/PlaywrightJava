package page;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.BoundingBox;
import utils.CommonUtils;


import java.util.List;

//import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static utils.CommonUtils.*;
//import static utils.DateTimeUtils.*;
//
//import static utils.DriversUtils.*;
//import static utils.WaitUtils.*;


public class HomePage extends BaseClass {

    private final Page page;
    private final Locator bookButton;
    private final Locator openBookButton;
    private final Locator roomCategoryIdentifier;
    private final Locator confirmationBooking;
    private final Locator submitButton;
    private final Locator thankYouMessage;
    private CommonUtils commonUtils;

    public HomePage(Page page) {
        this.page = page;
        this.bookButton = page.locator("(//button[contains(@class,'book-room')])[2]");
        this.openBookButton = page.locator("//button[contains(@class,'openBooking')]");
        this.roomCategoryIdentifier = page.locator("//h2");
        this.confirmationBooking = page.locator("//div[contains(@class,\"confirmation-modal\")]//div//h3");
        this.submitButton = page.locator("#submitContact");
        this.thankYouMessage = page.locator("(//h2)[2]");
    }

    public void goToRoomsCategory() {
        try {
            logger.info("Attempting to scroll to the rooms category...");
            commonUtils.scrollToElement(openBookButton);
            logger.info("Successful scrolling to the rooms category");
        } catch (RuntimeException e) {
            logger.info("Error while scrolling to the rooms category");
            System.out.println("Error in the rooms category method");
        }
    }

   // public void assertBookButtonDisplayed() {
       // Assert.assertEquals(true, bookButton.isDisplayed());
    //}

    public void navigateToHomePage() {
        page.navigate("https://automationintesting.online/#/");
    }

    public void clickOpenBookButton() {
        openBookButton.click();

    }

    /*public void selectAvailableNights(String startingDate, int amountNights) {
        int endDate = 1;
        if (startingDate.equals("currentDay")) {
            startingDate = selectCurrentDay();
            endDate = Integer.parseInt(startingDate) + amountNights;
        }

        WebElement firstNightToBook = getDriver().findElement(By.xpath("//button[@class='rbc-button-link'][text()='" + startingDate + "']"));
        WebElement lastNightToBook;
        if (endDate < 10) {
            lastNightToBook = getDriver().findElement(By.xpath("//button[@class='rbc-button-link'][text()='" + 0 + String.valueOf(endDate) + "']"));
        } else {
            lastNightToBook = getDriver().findElement(By.xpath("//button[@class='rbc-button-link'][text()='" + String.valueOf(endDate) + "']"));
        }

        //Selenium 4 changes in Actions API
        selectDatesInCalendar(firstNightToBook, lastNightToBook);
    }
*/
//    public void fillInInfo(String locator, String value) {
//        //replace the word REPLACE with the correct locator
//        WebElement personalInfo = getDriver().findElement(By.xpath(String.format("//input[@aria-label='%s']", locator)));
//        personalInfo.sendKeys(value);
//    }

    public void clickBookButton() {
        bookButton.click();
    }

//    public void assertBookingSuccessful() {
////        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
////        wait.until(ExpectedConditions.visibilityOf(confirmationBooking));
//        waitUntilElementExists(confirmationBooking);
//        System.out.println(confirmationBooking.getText());
//        Assert.assertEquals("Booking Successful!", confirmationBooking.getText());
//    }
//
//    public void fillSubjectAndMessage(List<String> messageValues) {
//        //FILLin the form using Relative locators related to the SUBMIT Button
//        List<WebElement> formInformationFields = getDriver().findElements(with(
//                By.className("form-control"))
//                .above(By.id("submitContact")));
//        System.out.println(formInformationFields.stream().count());
//
//        for (String messageValue : messageValues)
//            for (WebElement formInformation : formInformationFields) {
//                System.out.println("value is:" + formInformation.getAttribute("value") + "here here2");
//                if (formInformation.getAttribute("value") == null || formInformation.getAttribute("value").length() == 0) {
//                    System.out.println("here here");
//                    formInformation.sendKeys(messageValue);
//                }
//            }
//
//        submitButton.click();
//    }
//
//    public void assertThankYouMessageDisplayed(String message) {
//        waitUntilElementExists(thankYouMessage);
//        System.out.println(thankYouMessage.getText());
//        Assert.assertTrue(thankYouMessage.getText().contains(message));
//    }
}


