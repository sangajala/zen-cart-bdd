package com.zen;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sairam on 03/08/2014.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/cucumber"},tags ="@home")
public class runTests {
}
