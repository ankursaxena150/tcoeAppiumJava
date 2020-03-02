package DDDD;

/**
 * <p>
 * Force auth header modes.
 * </p>
 */
public enum TDAPI_BASIC_AUTH_HEADER_MODES {
  /**
   * <p>
   * do not add header
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  HEADER_MODE_DO_NOT_ADD, // 0
  /**
   * <p>
   * add header once
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  HEADER_MODE_ONCE, // 1
  /**
   * <p>
   * add header each time
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  HEADER_MODE_ALWAYS, // 2
}
