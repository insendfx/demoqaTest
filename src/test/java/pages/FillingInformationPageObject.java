package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FillingInformationPageObject {

    private SelenideElement
            firstLoginInput = $("#user-name"),
            lastPasswordInput = $("#password"),
            clickLogin = $("#login-button"),
            oneProduct = $("#add-to-cart-sauce-labs-backpack"),
            twoProduct = $("#add-to-cart-sauce-labs-bike-light"),
            container = $("#shopping_cart_container"),
            nextShopping = $("#continue-shopping"),
            finalProduct = $("#add-to-cart-sauce-labs-bolt-t-shirt"),
            checkout = $("#checkout");


    public FillingInformationPageObject openPage(){
        open("https://www.saucedemo.com/");
        return new FillingInformationPageObject();
    }
    public FillingInformationPageObject setLogin(String text){
        firstLoginInput.setValue(text);
        return this;
    }
    public FillingInformationPageObject setPassword(String text){
        lastPasswordInput.setValue(text);
        return this;
    }
    public FillingInformationPageObject clickLogin() {
        clickLogin.click();
        return this;
    }
    public FillingInformationPageObject oneProduct() {
        oneProduct.click();
        return this;
    }
    public FillingInformationPageObject twoProduct() {
        twoProduct.click();
        return this;
    }
    public FillingInformationPageObject container() {
        container.click();
        return this;
    }
    public FillingInformationPageObject nextShopping() {
        nextShopping.click();
        return this;
    }
    public FillingInformationPageObject finalProduct() {
        finalProduct.click();
        return this;
    }
    public FillingInformationPageObject checkout() {
        checkout.click();
        return this;
    }


    public static class AboutMe {

        private SelenideElement
                firstName = $("#first-name"),
                lastName = $("#last-name"),
                postalCode = $("#postal-code");


        public AboutMe firstName(String text) {
            firstName.setValue(text);
            return this;
        }
        public AboutMe lastName (String text) {
            lastName.setValue(text);
            return this;
        }
        public AboutMe postalCode (String text){
            postalCode.setValue(text);
            return this;
        }
    }
    public static class Finish {

        private SelenideElement
                cont = $("#continue"),
                finish = $("#finish");

        public Finish cont(){
            cont.click();
            return this;
        }
        public Finish finish() {
            finish.click();
            return this;
        }
    }
}


