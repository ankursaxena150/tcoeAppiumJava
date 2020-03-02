package enums;

/**
 * This class contains dictionary data representing Currencies
 *
 * @author a083259
 */

public enum Currency {

    empty("---"),
    SEK("SEK"),
    EUR("EUR"),
    USD("USD"),
    YEN("JPY"),
    INR("INR"),
    BRL("BRL"),
    AUD("AUD"),
    CNY("CNY");

    private final String value;

    private Currency(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
