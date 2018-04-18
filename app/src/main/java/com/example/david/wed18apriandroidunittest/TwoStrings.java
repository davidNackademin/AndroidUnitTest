package com.example.david.wed18apriandroidunittest;

/**
 * Created by david on 2018-04-18.
 */

public class TwoStrings {

    private String strOne;
    private String strTwo;

    public TwoStrings(String strOne, String strTwo) {
        this.strOne = strOne;
        this.strTwo = strTwo;
    }

    public String add() {
        return strOne + strTwo;
    }

    public String subtract() {
        if (strTwo.length() > strOne.length())
            return strTwo.substring(strOne.length());

        return strOne.substring(strTwo.length());
    }

}
