package com.example.test.remote.tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("remote")
public class CheckTest extends BaseTest{

    @Test
    @Step("testing")
    public void test1() {
        step("first action", () -> {

        });

        step("second action", () -> {

        });

        step("third action", () -> {
            Assertions.assertTrue(false);
        });
    }

    @Test
    @Step("t2")
    public void test2() {
        step("check false", () -> {
            Assertions.assertFalse(true);
        });
    }
}
