package com.blackClover.lesson11;

public class Pair<L, R> {
    private L valueL;
    private R valueR;

    public Pair(L valueL, R valueR) {
        this.valueL = valueL;
        this.valueR = valueR;
    }

    public L getValueL() {
        return valueL;
    }

    public R getValueR() {
        return valueR;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "valueL=" + valueL +
                ", valueR=" + valueR +
                '}';
    }

}
