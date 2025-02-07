package utils;

import com.microsoft.playwright.*;

public class CommonUtils {
    private Page page;
    public void scrollDown() {
        page.evaluate("window.scrollBy(0, 250)");
    }

    public void scrollToElement(Locator elementSelector){
        System.out.println("here here");
       elementSelector.waitFor();
       elementSelector.scrollIntoViewIfNeeded();
        //page.evaluate("window.scrollBy(0, arguments[0].getBoundingClientRect().top - 100)", elementSelector);
        System.out.println("after after");
    }
}