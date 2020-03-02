package DDDD;

import com4j.ComEnum;

/**
 * <p>
 * AutoComplete Type.
 * </p>
 */
public enum TDAPI_AUTOCOMPLETE_TYPE implements ComEnum {
  /**
   * <p>
   * No autocomplete.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  AC_TYPE_NO_AUTOCOMPLETE(0),
  /**
   * <p>
   * Req to Tests autocomplete.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  AC_TYPE_REQ_TO_TEST(1),
  /**
   * <p>
   * Tests to all its test instances.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  AC_TYPE_TEST_TO_TEST_INSTANCE(2),
  /**
   * <p>
   * Scope item content to all defects.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  AC_TYPE_SCOPE_ITEM_TO_DEFECT(4),
  ;

  private final int value;
  TDAPI_AUTOCOMPLETE_TYPE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
