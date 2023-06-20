package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Hooks {

    @Before
    public void setupMethod() {
        log.info("@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @BeforeStep
    public void beforeStep() {
        log.info("@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    @AfterStep
    public void afterStep() {
        log.info("@AfterStep: RUNNING AFTER EACH STEP");
    }

    @After
    public void teardownMethod() {

        log.info("@After: RUNNING AFTER EACH SCENARIO");

        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }

}
