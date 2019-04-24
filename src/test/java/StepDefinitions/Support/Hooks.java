package StepDefinitions.Support;

//import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseSteps{

    // TODO: - Work in progress - for the Screenshot method!
//    public static String scenarioName;

//    @Before
//    public void setup(Scenario scenario) throws Exception {
//        initializeDriver("chrome");
//        this.scenarioName = scenario.getName();
//    }

    @Before
    public void setup() throws Exception {
        initializeDriver("chrome");
    }

    @After
    public void tearDown() {
        exitDriver();
    }


}
