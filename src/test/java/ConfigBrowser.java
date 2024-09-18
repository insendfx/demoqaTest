import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class ConfigBrowser {
    @BeforeAll
    public static void config() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1200";
    }
}
