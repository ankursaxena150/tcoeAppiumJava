package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Description of a database table.
 */
@IID("{C015CC00-5F0F-4DD6-9D8C-733B1412BB1B}")
public interface ITableProperties extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The name of the database table.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String name();


  /**
   * <p>
   * The display name of the table.
   * </p>
   * <p>
   * Getter method for the COM property "UserLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String userLabel();


  // Properties:
}
