package com.blackClover.lesson11;

public class Triple<L, M, R> {
    private L valueTripleL;
    private M valueTripleM;
    private R valueTripleR;

    public Triple(L valueTripleL, M valueTripleM, R valuetripleR) {
        this.valueTripleL = valueTripleL;
        this.valueTripleM = valueTripleM;
        this.valueTripleR = valuetripleR;
    }

    public L getValueTripleL() {
        return valueTripleL;
    }

    public M getValueTripleM() {
        return valueTripleM;
    }

    public R getValuetripleR() {
        return valueTripleR;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "valueTripleL=" + valueTripleL +
                ", valueTripleM=" + valueTripleM +
                ", valuetripleR=" + valueTripleR +
                '}';
    }
}
