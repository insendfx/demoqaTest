import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FillingInformation {

    @Test
    public void FillingInfoAboutMe () {
        //Конфигурация браузера
        Configuration.browser = "firefox";
        Configuration.browserSize = "2560x1440";
        //Открываем стартовую страницу
        open("https://www.saucedemo.com/");
        //Проходим авторизацию на сайте
        $("#user-name").setValue("standard_user");
        $("#password").setValue("secret_sauce");
        //Нажимаем на кнопку Login
        $("#login-button").click();
        //Добавляем товары в корзину
        $("#add-to-cart-sauce-labs-backpack").click();
        $("#add-to-cart-sauce-labs-bike-light").click();
        //Переходим в корзину
        $("#shopping_cart_container").click();
        //Нажимаем на кнопку продолжить покупки
        $("#continue-shopping").click();
        //Добавляем футболку, чтобы быть крутым
        $("#add-to-cart-sauce-labs-bolt-t-shirt").click();
        //После повторно заходим в корзину
        $("#shopping_cart_container").click();
        //Формируем заказ
        $("#checkout").click();
        //Вводим информацию о себе
        $("#first-name").setValue("Sergey");
        $("#last-name").setValue("Sayutin");
        $("#postal-code").setValue("625035,Tyumen,Bovanenko 1, 116");
        //Переходим на следующий шаг
        $("#continue").click();
        $("#finish").click();
        sleep(40000);
    }
}
