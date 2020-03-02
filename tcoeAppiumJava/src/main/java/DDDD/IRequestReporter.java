package DDDD;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. IRequestReporter Interface.
 */
@IID("{B72575EC-2E8A-41AF-8986-CBF022A240E1}")
public interface IRequestReporter extends Com4jObject {
  // Methods:
  /**
   * @param loginSessionId Mandatory int parameter.
   * @param projectSessionId Mandatory int parameter.
   * @param requestId Mandatory java.lang.String parameter.
   * @param requestType Mandatory java.lang.String parameter.
   */

  @VTID(3)
  void onSendingRequestToServer(
          int loginSessionId,
          int projectSessionId,
          String requestId,
          String requestType);


  /**
   * @param loginSessionId Mandatory int parameter.
   * @param projectSessionId Mandatory int parameter.
   * @param requestId Mandatory java.lang.String parameter.
   * @param requestType Mandatory java.lang.String parameter.
   */

  @VTID(4)
  void onReceivedResponseFromServer(
          int loginSessionId,
          int projectSessionId,
          String requestId,
          String requestType);


  /**
   * @param requestId Mandatory java.lang.String parameter.
   * @param performanceInfo Mandatory java.lang.String parameter.
   */

  @VTID(5)
  void updateRequestPerformanceInfo(
          String requestId,
          String performanceInfo);


  // Properties:
}
