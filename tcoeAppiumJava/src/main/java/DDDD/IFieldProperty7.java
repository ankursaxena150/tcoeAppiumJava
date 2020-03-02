package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Exposes a virtual or transient property.
 */
@IID("{C77652F6-3F66-40E4-91DA-9915213D41FE}")
public interface IFieldProperty7 extends IFieldProperty6 {
  // Methods:
  /**
   * <p>
   * Checks if the field is virtual.
   * </p>
   * <p>
   * Getter method for the COM property "IsVirtual"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(46)
  boolean isVirtual();


  /**
   * <p>
   * Checks if the field is transient.
   * </p>
   * <p>
   * Getter method for the COM property "IsTransient"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(47)
  boolean isTransient();


  // Properties:
}
