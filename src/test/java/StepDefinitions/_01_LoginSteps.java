package StepDefinitions;



import Pages.DialogContent;
import Utilities.GWD_old;
import io.cucumber.java.en.*;


public class _01_LoginSteps {

    DialogContent dc=new DialogContent();


    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site acildi");
        GWD_old.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("username ve sifre gönderildi");


        // WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.visibilityOf(dc.username));
//

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);


    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Siteye girildigi kontrol edildi");


       // WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.textToBePresentInElement(dc.headText,"Internship"));
//
  //     Assert.assertTrue(dc.headText.getText().equals("Internship"));


        dc.verifyContainsText(dc.headText,"Internship");



    }
}