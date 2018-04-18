package com.example.david.wed18apriandroidunittest;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by david on 2018-04-18.
 */

public class TwoStringsTest {

    @Test
    public void canAdd() {
        // given
        TwoStrings twoStr = new TwoStrings("one", "two");

        // when
        String result = twoStr.add();

        // then
        assertEquals("Error adding", "onetwo", result);
    }

    @Test
    public void canSubtract() {
        //given
        TwoStrings twoStr = new TwoStrings("David", "Per");
        TwoStrings oneIsShorter = new TwoStrings("Per", "David");
        TwoStrings equalSize = new TwoStrings("Per", "Ola");

        //when
        String result = twoStr.subtract();
        String result2 = oneIsShorter.subtract();
        String result3 = equalSize.subtract();

        //then
        assertEquals("Error Subtracting", "id", result);
        assertEquals("Error Subtracting", "id", result2);
        assertEquals("Error Subtracting", "", result3);

    }



}
