package steps;

import flow.YandexFlow;
import pages.Navigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class YandexSteps {

    @When("^User open (.*) page")
    public void openYandexPage(String stand) {
        Navigation.navigateToUrl(stand);

    }

    @When("^User open yandex link with (.*)")
    public void userOpenYandexLinkWith(String link) {
        YandexFlow.openServicesLink(link);

    }

    @And("^User user download picture with (.*)")
    public void userUserDownloadPictureWith(String path) throws IOException {
        Navigation.switchToBrowserLink(1);
        YandexFlow.downloadPicture(path);

    }

    @Then("^User see that (.*) is (.*)")
    public void userSeeThatPictureIs(String pictureName, String state) {
        YandexFlow.verifyPictureIs(pictureName, state);
    }
}
