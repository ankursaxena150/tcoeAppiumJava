package enums;

/**
 * This class contains dictionary data representing Models
 *
 * @author a083259
 */

public enum ModelName {

    VHD("VHD (Volvo Trucks)"),
    VN("VN (Volvo Trucks)");

    private final String value;

    private ModelName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
