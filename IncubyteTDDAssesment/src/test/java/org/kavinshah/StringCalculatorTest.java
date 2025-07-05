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

    @Test
    void SumOfNumberSeparatedByComma()
    {
        assertEquals(7,new StringCalculator().add("3,4"));
        assertEquals(6,new StringCalculator().add("3,3"));
    }
    @Test
    void SumOfLargeNumberSeparatedByComma()
    {
        StringBuffer testinput=new StringBuffer();
        for(int i=1;i<=10000000;i++)
        {
            testinput.append("2,");
        }

        assertEquals(20000000L,new StringCalculator().add(testinput.toString()));
    }


}
