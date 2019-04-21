package StepDefinitions.Support;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseSteps{

    @Before
    public void setup() throws Exception {
        initializeDriver("chrome");
    }

    @After
    public void tearDown() {
        exitDriver();
    }


}
