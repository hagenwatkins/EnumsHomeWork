package com.tiy;

public enum Month {
    JANUARY(true),
    FEBRUARY(true),
    MARCH (true),
    APRIL(true),
    MAY(true),
    JUNE(true),
    JULY(true),
    AUGUST(true),
    SEPTEMBER(true),
    OCTOBER(true),
    NOVEMBER(true),
    DECEMBER(true);

    Month(boolean englishName) {
        this.englishName = englishName;
    }

    private final boolean englishName;
}
