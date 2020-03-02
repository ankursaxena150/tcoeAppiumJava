/*
 * Author: Pawel Piesniewski
 * ID: A049473
 */
package enums;


public enum Localization {

    WROCLAW("Wroclaw"),
    GOTHEBORG("Gotheborg"),
    BANGALORE("Bangalore");

    private final String value;

    private Localization(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
