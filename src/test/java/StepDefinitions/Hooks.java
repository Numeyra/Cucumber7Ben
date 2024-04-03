package StepDefinitions;

import Utilities.GWD_old;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before// Cucumber ın Annotation ı
    public void before(){
        // System.out.println("Senaryo başladı");
    }


    @After //Cucumber in Annotation
   //her senaryodan sonra calisir
public void after(Scenario senaryo){

        //senaryo fail olduysa ekran kaydı al
        if (senaryo.isFailed()){
            // aşağıdaki bölüm sadece extend report plugini devrede ise açılır
//            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
//            byte[] hafizadakiHali= ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }



        GWD_old.quitDriver();













   }
}
