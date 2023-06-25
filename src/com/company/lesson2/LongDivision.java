package com.company.lesson2;

public class LongDivision {
    private final long quotient;
    private final long remainder;

    public LongDivision(long quotient, long remainder) {
        this.quotient = quotient;
        this.remainder = remainder;
    }

    public long getQuotient() {
        return quotient;
    }

    public long getRemainder() {
        return remainder;
    }
}
