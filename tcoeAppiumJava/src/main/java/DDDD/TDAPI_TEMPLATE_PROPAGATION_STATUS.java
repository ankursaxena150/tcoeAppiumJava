package DDDD;

/**
 * <p>
 * Possible results of template propagation analysis and enforcement.
 * </p>
 */
public enum TDAPI_TEMPLATE_PROPAGATION_STATUS {
  /**
   * <p>
   * Template analysis / enforcement has completed successfully.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  TDAPI_PROPAGATION_SUCCESS, // 0
  /**
   * <p>
   * Template analysis / enforcement has completed with warnings.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  TDAPI_PROPAGATION_WARNINGS, // 1
  /**
   * <p>
   * Template analysis / enforcement has failed.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  TDAPI_PROPAGATION_FAILURE, // 2
  /**
   * <p>
   * Template analysis / enforcement has failed. Version mismatch.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  TDAPI_PROPAGATION_FAILURE_VERSION_MISMATCH, // 3
  /**
   * <p>
   * Template analysis / enforcement has failed. Encoding mismatch.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  TDAPI_PROPAGATION_FAILURE_ENCODING_MISMATCH, // 4
  /**
   * <p>
   * Template analysis / enforcement has failed. Extension mismatch.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  TDAPI_PROPAGATION_FAILURE_EXTENSION_MISMATCH, // 5
}
