package DDDD.events;

import com4j.DISPID;
import com4j.IID;

/**
 * For HP use. _DIRequestReporterEvents.
 */
@IID("{E0591BA6-06C2-402C-A920-A0D530E9B89F}")
public abstract class _DIRequestReporterEvents {
  // Methods:
  /**
   * @param loginSessionId Mandatory int parameter.
   * @param projectSessionId Mandatory int parameter.
   * @param requestId Mandatory java.lang.String parameter.
   * @param requestType Mandatory java.lang.String parameter.
   */

  @DISPID(1)
  public void onSendingRequestToServer(
    int loginSessionId,
    int projectSessionId,
    String requestId,
    String requestType) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param loginSessionId Mandatory int parameter.
   * @param projectSessionId Mandatory int parameter.
   * @param requestId Mandatory java.lang.String parameter.
   * @param requestType Mandatory java.lang.String parameter.
   */

  @DISPID(2)
  public void onReceivedResponseFromServer(
    int loginSessionId,
    int projectSessionId,
    String requestId,
    String requestType) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param requestId Mandatory java.lang.String parameter.
   * @param performanceInfo Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  public void updateRequestPerformanceInfo(
    String requestId,
    String performanceInfo) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}
