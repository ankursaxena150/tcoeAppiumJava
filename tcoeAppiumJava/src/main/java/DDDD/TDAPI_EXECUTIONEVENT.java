package DDDD;

import com4j.ComEnum;

/**
 * <p>
 * Tests run events.
 * </p>
 */
public enum TDAPI_EXECUTIONEVENT implements ComEnum {
  /**
   * <p>
   * Tests Has Failed.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  EXECEVENT_TESTFAIL(1),
  /**
   * <p>
   * Tests Set Finished.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  EXECEVENT_TESTSETFINISH(2),
  /**
   * <p>
   * Environment Failure.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  EXECEVENT_ENVIRONMENTFAIL(3),
  /**
   * <p>
   * Execution continued longer than allowed.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  EXECEVENT_RUNTIMEDOUT(4),
  /**
   * <p>
   * Tests should be launched manually.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  EXECEVENT_MANUAL_LAUNCH(5),
  ;

  private final int value;
  TDAPI_EXECUTIONEVENT(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
