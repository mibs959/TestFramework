package StepDefinitions.Support;

import Tools.ApiTesting.ApiRequestsMethods;
import Tools.RandomValueGenerator;
import Tools.ScennarioContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.http.NameValuePair;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class ApiTestingSteps extends ApiRequestsMethods {



    @Given("I perform a Get to the following URL: '(.*)'")
    public void PerformAGetRequest (String url) {
        ScennarioContext.saveData("GetJsonObject", GetMethod(url));
    }

    // TODO: Move this step to William Hill Steps once they are working.
    @Then("The GET Performed returned '{int}' Events")
    public void VerifyAmountOfEventsReturned (int numberOfEvents){
        JSONObject jsonObject = (JSONObject) ScennarioContext.getData("GetJsonObject");
        JSONArray events = (JSONArray) jsonObject.get("events");
        Assert.assertEquals(numberOfEvents, events.size());
    }

    /**
     * TODO: Move this step to William Hill Steps once they are working.
     * TODO: Ways to implement a better solution: Create a Event Type of Object to parse the JSON.
     * @param event
     */
    @Then("Among the Events there are '(.*)' Events")
    public void VerifyIfThereAreGivenEvents (String event){

        Boolean areThereAnyGivenEvents = false;

        JSONObject jsonObject = (JSONObject) ScennarioContext.getData("GetJsonObject");
        JSONArray events = (JSONArray) jsonObject.get("events");

        for (int i = 0; i < events.size(); i++){

            Object[] currrentEvent = ((JSONObject) events.get(i)).values().toArray();

            if (currrentEvent[4].toString().equals(event)){
                areThereAnyGivenEvents = true;
                break;
            }
        }

        Assert.assertTrue(areThereAnyGivenEvents);

    }



    // TODO: Move this step to William Hill Steps once they are working.
    @Then("Add a new Random Market Selection")
    public void AddSelection() throws IOException {

        String eventIdString = Long.toString(RandomValueGenerator.generateRandomNumericLong(5));
        String marketIdString = Long.toString(RandomValueGenerator.generateRandomNumericLong(5));

        // In a REAL framework this should be an object type...

        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("id", eventIdString));
        params.add(new BasicNameValuePair("selection", RandomValueGenerator.generateRandomAlphabeticString(5)));
        params.add(new BasicNameValuePair("price", "10"));
        params.add(new BasicNameValuePair("status", "Active"));
        params.add(new BasicNameValuePair("result", "Won"));

//        PostMethod("http://localhost:49160/event/" + eventIdString + "/market/" + marketIdString + "/addSelection", params);

        aDifferenPost("http://localhost:49160/event/" + eventIdString + "/market/" + marketIdString + "/addSelection");

    }





}

