package stepDefinitions;

import support.PageInitializer;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println("SCENARIO "+scenario.getName()+" STARTED");
        PageInitializer.Initialize();
    }

    @After
    public void teardown(){
        System.out.println("SCENARIO ENDED");
    }
}
