package page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.microsoft.playwright.Page;

public class BaseClass {
    static final Logger logger = LoggerFactory.getLogger(BaseClass.class);
    protected Page page;

    public void setAndConfigurePage(final Page page) {
        this.page = page;
    }
}
