package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class AlfaBankTests {
    @Test
    void AlfaTest1 () {
        // Open Alfa Bank's page
        open ("https://alfabank.ru/make-money/savings-account/");

        // Go to Deposits' page
        $(byTitle("Депозиты")).click();

        // Go to Archived Deposits' page
        $(byLinkText("Архивные депозиты")).click();

        // Only 3 elements should be shown
        $$(".product-cell__cell").shouldHaveSize(3);
    }

    @Test
    void AlfaTest2 () {
        Configuration.holdBrowserOpen = true;

        // Tap on Deposits
        $(byTitle("Вклады")).click();

        //
    }
}