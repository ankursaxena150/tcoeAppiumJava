package DDDD.events;

import com4j.DISPID;
import com4j.IID;

/**
 * For HP use. Progress events exposed by IAsyncResultStorage. Allow to track async results operations
 */
@IID("{1304BAA4-5772-4EF2-A7F8-09D97ADEC306}")
public abstract class _DIAsyncResultProgress {
  // Methods:
  /**
   * @param eType Mandatory DDDD.OPERATION_TYPE parameter.
   * @param current Mandatory int parameter.
   * @param context Mandatory java.lang.Object parameter.
   */

  @DISPID(1)
  public void onProgress(
    DDDD.OPERATION_TYPE eType,
    int current,
    Object context) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param eType Mandatory DDDD.OPERATION_TYPE parameter.
   * @param context Mandatory java.lang.Object parameter.
   */

  @DISPID(2)
  public void onOperationComplete(
    DDDD.OPERATION_TYPE eType,
    Object context) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param eType Mandatory DDDD.OPERATION_TYPE parameter.
   * @param pError Mandatory DDDD.IErrorInfo parameter.
   * @param context Mandatory java.lang.Object parameter.
   */

  @DISPID(3)
  public void onOperationFailed(
    DDDD.OPERATION_TYPE eType,
    DDDD.IErrorInfo pError,
    Object context) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
