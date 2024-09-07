package com.rohan.software;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TimeoutTest {
    @Test
    public void test1(){

        assertTimeout(Duration.ofMillis(100),() -> {
            Timeout.sortTimeout();
        });
    }

}