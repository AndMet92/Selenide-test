package selenide;

import org.junit.Test;
import org.openqa.selenium.By;

import javax.xml.xpath.XPath;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTestXPath {
    private Object ByXPath;

    @Test
    public void selenide(){
        open("https://todomvc.com/examples/emberjs");

        element(byXpath("//input[@id='new-todo']")).setValue("a").pressEnter();
        element(byXpath("//input[@id='new-todo']")).setValue("b").pressEnter();
        element(byXpath("//input[@id='new-todo']")).setValue("c").pressEnter();
        elements(byXpath("//*[@id='main']//*[@class='ember-view']")).shouldHave(exactTexts("a","b","c"));
        //element(byXpath("//input[@class='toggle']")).click();
        element(byXpath("//*[@id='todo-list']/li[2]//*[@class='toggle']")).click();
        elements(byXpath("//*[@id='todo-list']//*[@class='completed ember-view']")).shouldHave(exactTexts( "b"));
        elements(byXpath("//*[@id='todo-list']//*[@class='ember-view']")).shouldHave(exactTexts( "a","c"));





    }



}

