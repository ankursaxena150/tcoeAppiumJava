package DDDD;

import com4j.ComEnum;

/**
 */
public enum OPERATION_TYPE implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  OPERATION_TYPE_UPLOAD(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  OPERATION_TYPE_DOWNLOAD(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  OPERATION_TYPE_CLEAN(3),
  ;

  private final int value;
  OPERATION_TYPE(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
