package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to country")
    public void navigateToCountry() {

        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);

     //left nav da
      //Setup
        // Parameters
      //  Countries

    }
    @When("Create a country")
    public void createACountry() {
//ülke adi ve kodu degisken yapayim ,sürekli bana versin,hicbir seklide hata vermez

        String ulkeAdi= RandomStringUtils.randomAlphanumeric(8);//8 harf ver
        String ulkeKodu= RandomStringUtils.randomNumeric(4);//4 rakam ver
        dc.myClick(dc.addBuutton);
        dc.mySendKeys(dc.nameInput,ulkeAdi);//ulke ad ve kodundan cift tirnak kaldirdim .cünkü artik sabit degil degiskendir
        dc.mySendKeys(dc.codeInput, ulkeKodu);
        dc.myClick(dc.saveButton);
        //Add (+) buttonuna bas
        //ismi gönder
        //kisa adi gönder
        //save buttonuna bas

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

dc.verifyContainsText(dc.successMessage,"success");
     //success yazisini dogrula


    }


    @When("Create a country name as  {string}  code as {string}")
    public void createACountryNameAsCodeAs(String ulkeAdi, String ulkeKodu) {

        dc.myClick(dc.addBuutton);
        dc.mySendKeys(dc.nameInput,ulkeAdi);//ulke ad ve kodundan cift tirnak kaldirdim .cünkü artik sabit degil degiskendir
        dc.mySendKeys(dc.codeInput, ulkeKodu);
        dc.myClick(dc.saveButton);





    }
}