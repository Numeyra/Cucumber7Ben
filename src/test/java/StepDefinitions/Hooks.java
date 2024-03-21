package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

   @After //Cucumber in Annotation
   //her senaryodan sonra calisir
public void after(){

       GWD.quitDriver();













   }
}
