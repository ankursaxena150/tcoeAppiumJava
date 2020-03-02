package enums;

public enum XMLDifferences {
    NoDiffs(0), OneDiff(1);

    private final int value;

    private XMLDifferences(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

