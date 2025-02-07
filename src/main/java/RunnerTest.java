import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;
@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber-report.json")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "page,features.stepDefinitions")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@book")
public class RunnerTest {
}

