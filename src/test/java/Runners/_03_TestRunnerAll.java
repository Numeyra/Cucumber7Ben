package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = {"src/test/java/FeatureFiles"},  //klasösrdeki butun featur lar

        glue ={"StepDefinitions"}
)

public class _03_TestRunnerAll extends AbstractTestNGCucumberTests {
}
