package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},  //klasösrdeki butun featur lar

        glue ={"StepDefinitions"}
)



public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
