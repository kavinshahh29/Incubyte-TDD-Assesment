package org.kavinshah;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void test() {

    }
    @Test
    void ZeroOnEmptyString()
    {
        assertEquals(0,new StringCalculator().add(""));
        assertEquals(7,new StringCalculator().add("7"));
    }


}
