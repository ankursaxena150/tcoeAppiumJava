package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents the notification to be sent by e-mail after a test set has completed its run.
 */
@IID("{4506E5AF-54EB-4067-AFB8-ACFEF7283E48}")
public interface ITestSetExecutionReportSettings2 extends ITestSetExecutionReportSettings {
  // Methods:
  /**
   * <p>
   * The CCTos' e-mail addresses.
   * </p>
   * <p>
   * Getter method for the COM property "CCTo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  String ccTo();


  /**
   * <p>
   * The CCTos' e-mail addresses.
   * </p>
   * <p>
   * Setter method for the COM property "CCTo"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void ccTo(
          String pVal);


  // Properties:
}
