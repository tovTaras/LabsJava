package ua.lviv.iot.lab2.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionTest extends Manager {
    public RegularExpression test;
    @BeforeEach
    void setUp() {
        test = new RegularExpression();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findRegularExp() {
        test.findRegularExp();
    }
}