package selenide;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
    @Test
    public void selenide(){
        open("https://todomvc.com/examples/emberjs");
        element(By.id("new-todo")).setValue("a").pressEnter();
        element(By.id("new-todo")).setValue("b").pressEnter();
        element(By.id("new-todo")).setValue("c").pressEnter();
        elements("#todo-list>li").shouldHave(exactTexts("a","b","c"));
        elements("#todo-list>li").findBy(Condition.exactText("b")).find(".toggle").click();
        elements("#todo-list>li").filterBy(Condition.cssClass("completed")).shouldHave(exactTexts("b"));
        elements("#todo-list>li").filterBy(Condition.not(Condition.cssClass("completed"))).shouldHave(exactTexts("a","c"));


    }

    private void open(java.lang.String string) {
    }


}
