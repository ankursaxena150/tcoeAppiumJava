package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Obsolete.
 */
@IID("{84F1A917-9318-46B2-8C36-00C184EE00C2}")
public interface IHistory2 extends IHistory {
  // Methods:
  /**
   * <p>
   * Obsolete. Depending on platform and ALM version, either does nothing or throws an exception.
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   * @param versionNumber Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  IList newListEx(
          String filter,
          String versionNumber);


  // Properties:
}
