package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Services for managing alerts.
 */
@IID("{AAA7D0A8-433C-4A92-8A8C-E160C743FD68}")
public interface IAlertManager2 extends IAlertManager {
  // Methods:
  /**
   * <p>
   * For HP use. Returns the text of the default alert filter.
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  String getFilterText();


  /**
   * <p>
   * Removes alerts associated with objects of the specified type from the database if they match the filter.
   * </p>
   * @param entityType Mandatory java.lang.String parameter.
   * @param filter Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  void deleteAlertsByFilter(
          String entityType,
          String filter);


  // Properties:
}
