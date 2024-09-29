package codeWars;

public class WhatCenturyIs {
    public static String whatCentury(int year) {
        int century = (year % 100 == 0) ? (year / 100) : (year / 100) + 1;
        String centuryStr = String.valueOf(century);

        if (centuryStr.endsWith("11") || centuryStr.endsWith("12") || centuryStr.endsWith("13")) {
            return centuryStr + "th";
        }

        switch (centuryStr.charAt(centuryStr.length() - 1)) {
            case '1':
                return centuryStr + "st";
            case '2':
                return centuryStr + "nd";
            case '3':
                return centuryStr + "rd";
            default:
                return centuryStr + "th";
        }
    }

    public static void main(String[] args) {
        int year = 3900;
        System.out.println(whatCentury(year));
    }
}
