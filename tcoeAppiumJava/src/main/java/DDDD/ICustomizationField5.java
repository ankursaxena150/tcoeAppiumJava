package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Additional properties of the customization field.
 */
@IID("{97C01247-1E6C-4A06-924E-C96162AF9BD3}")
public interface ICustomizationField5 extends ICustomizationField4 {
  // Methods:
  /**
   * <p>
   * [for HP Use Only] Returns true if this field is transient.
   * </p>
   * <p>
   * Getter method for the COM property "IsTransient"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(101)
  boolean isTransient();


  // Properties:
}
