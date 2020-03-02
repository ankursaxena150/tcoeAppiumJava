package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Services to support locking objects.
 */
@IID("{3770977E-1465-44C7-813F-FE20E961CF83}")
public interface IObjectLockingSupport3 extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns true when object is locked by another user session.
   * </p>
   * <p>
   * Getter method for the COM property "IsLockedByOtherSession"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  boolean isLockedByOtherSession();


  // Properties:
}
