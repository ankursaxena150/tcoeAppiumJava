package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Properties for object fields.
 */
@IID("{990DDBDD-99AB-4689-980C-4B0F8FE6E29A}")
public interface IFieldProperty3 extends IFieldProperty2 {
  // Methods:
  /**
   * <p>
   * Checks if the field is required according to the requirement type.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610874880) //= 0x60040000. The runtime will prefer the VTID if present
  @VTID(38)
  boolean getRequiredByType();


  // Properties:
}
