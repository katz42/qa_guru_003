package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class AlfaBankTests {
    @Test
    void ArchivedDepositsTest() {
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
    void DepositInsuranceTest() {

        // Open Deposits's page
        open ("https://alfabank.ru/make-money/");

        // Open Deposit insurance's page
        $(byTitle("Накопительные счета")).parent().sibling(4).click();

        // Second option (using closest and preceding)
        //$(byTitle("Специальный счет по 44-ФЗ")).closest("li").preceding(0).click();

        // Make sure Deposit insurance's page is opened
        $(".frame-head").shouldHave(text("Страхование вкладов"));
    }
}