package com.example.test.remote.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void simplePropertiesTest() {
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simplePropertiesTest1() {
        System.setProperty("browser", "opera");

        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void simplePropertiesTest2() {
        String browserName = System.getProperty("browser", "firefox");
        System.out.println(browserName);
    }

    @Test
    @Tag("hello")
    void simplePropertiesTest3() {
        System.out.println(" " + System.getProperty("user_name", "someone"));
        // gradle clean hello_test -Duser_name=AAA
    }
}
