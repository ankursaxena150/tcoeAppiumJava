package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Obsolete. Do not use. Was: Represents a parameter group member.
 */
@IID("{E550A72D-F4CB-43D1-8B08-0ADF4397421E}")
public interface IParameterGroupMember extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Obsolete. Do not invoke.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean isSubGroup();


  // Properties:
}
