import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import pages.FillingInformationPageObject;

import static com.codeborne.selenide.Selenide.*;

public class FillingInformation extends ConfigBrowser {

    FillingInformationPageObject pageObject = new FillingInformationPageObject();
    FillingInformationPageObject.AboutMe aboutMe = new FillingInformationPageObject.AboutMe();
    FillingInformationPageObject.Finish finish = new FillingInformationPageObject.Finish();

    @Test
    void FillingInfoAboutMe(){

        pageObject.openPage()
                .setLogin("standard_user")
                .setPassword("secret_sauce")
                .clickLogin()
                .oneProduct()
                .twoProduct()
                .container()
                .nextShopping()
                .finalProduct()
                .container()
                .checkout();

        aboutMe.firstName("Sergey")
                .lastName("Sayutin")
                .postalCode("625035,Tyumen,Bovanenko 1, 116");
        finish.cont()
                .finish();
        sleep(4000);
    }
}
