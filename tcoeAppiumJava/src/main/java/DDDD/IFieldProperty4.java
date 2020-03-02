package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * IFieldProperty4 Interface.
 */
@IID("{9C5C5CEF-82D1-48E2-AA3E-44EE0EBB3D03}")
public interface IFieldProperty4 extends IFieldProperty3 {
  // Methods:
  /**
   * <p>
   * Checks whether the field originated from the project template.
   * </p>
   * <p>
   * Getter method for the COM property "IsTemplate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(39)
  boolean isTemplate();


  // Properties:
}
