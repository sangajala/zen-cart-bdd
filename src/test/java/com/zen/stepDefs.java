package com.zen;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import cucumber.runtime.PendingException;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Sairam on 03/08/2014.
 */
public class stepDefs {

    WebDriver driver;
    @Before
    public void start()
    {
        driver = new FirefoxDriver();
    }

    @After
    public void stop()
    {
        driver.quit();
    }

    @Given("^consumer is in homepage$")
    public void consumer_is_in_homepage() {

        driver.get("http://sangajala1-001-site1.smarterasp.net/");
    }

    @Then("^a category exists in the left panel$")
    public void a_category_exists_in_the_left_panel() {
        Assert.assertTrue(driver.findElement(By.linkText("Sample Cat")).isDisplayed());
    }

    @Then("^the number of item available should be shown$")
    public void the_number_of_item_available_should_be_shown() {
        itemCount = 1;
        System.out.println(driver.findElement(By.tagName("body")).getText());
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("("+itemCount+")"));
    }

    @When("^consumer opens the category with name '(.*)'$")
    public void consumer_opens_the_category_with_name_(String cat) {
    System.out.println("Category"+cat);
        driver.findElement(By.linkText(cat)).click();
    }


int itemCount=0;
    @Then("^the number of items should match the available items$")
    public void the_number_of_items_should_match_the_available_items() {

        String exp = "of "+itemCount+" products";
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(exp));
    }

    @Then("^the list of products with name as '(.*)' under the category should be shown$")
    public void the_list_of_products_with_name_as_test_under_the_category_should_be_shown(String item) throws Throwable {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(item));
    }
}
