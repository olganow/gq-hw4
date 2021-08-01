package ru.ya.olganow;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
public class DragAndDropTest  {

    @Test
    void dragAndDrop() {
        // open the page
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // swap А and В
        $("#column-a").dragAndDropTo("#column-b");

        // check that the rectangles are swapped
        $("#column-b").shouldHave(Condition.text("A"));
        $("#column-a").shouldHave(Condition.text("B"));
    }
}