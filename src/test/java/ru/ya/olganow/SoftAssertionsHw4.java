package ru.ya.olganow;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsHw4 {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }


    @Test
    void successfulSubmitFormTest() {
        //1. Navigate to Selenide page
        open("https://github.com/selenide/selenide/");

        // 2. Find Wiki element and click
        $$(".js-repo-nav li").findBy(text("Wiki")).click();

        // 3. SoftAssertions page is enabled on Pages list

        $(".js-wiki-more-pages-link").click();

        //4. Open SoftAssertions
        $(byText("SoftAssertions")).click();

        //5. Confirm that there is code for JUnit5

        $(byText("Using JUnit5 extend test class:")).shouldBe(visible);

    }


}