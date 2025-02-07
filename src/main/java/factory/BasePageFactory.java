package factory;

import com.microsoft.playwright.Page;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import page.BaseClass;


//Responsible for instantiating page objects dynamically.
public class BasePageFactory {
    private final Page page;
    public BasePageFactory(Page page) {
        this.page = page;
    }

    public <T extends BaseClass> T getPage(Class<T> pageClass) {
        try {
            return  pageClass.getDeclaredConstructor(Page.class).newInstance(page);
        }
        catch (Exception e) {
            throw  new RuntimeException("Failed to create page:" + pageClass.getName(), e);
        }
    }



}
