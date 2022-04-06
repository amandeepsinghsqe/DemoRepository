package com.ComCate.CommonMethods;

public class RandomStrings {
    public static String RequiredString(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz" + "               ";
        StringBuilder s = new StringBuilder(n);
        int y;
        for ( y = 0; y < n; y++)
        {
            int index = (int)(AlphaNumericString.length() * Math.random());
            s.append(AlphaNumericString.charAt(index));
        }
        return s.toString();

    }
}
