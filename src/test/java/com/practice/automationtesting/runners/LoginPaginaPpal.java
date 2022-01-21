package com.practice.automationtesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/LoginPaginaPpal.feature",
        glue = "com/practice/automationtesting/stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class LoginPaginaPpal {


}
