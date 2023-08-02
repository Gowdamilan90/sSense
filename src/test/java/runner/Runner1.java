package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"featureFiles/OutDoorLiving.feature"}, glue="steps", monochrome =true,plugin={"pretty","junit:reports/JUnitReports/report.xml"})

public class Runner1 

{

}



