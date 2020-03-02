package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services for managing the collection of all CustomizationUsersGroup objects.
 */
@IID("{2EDCC94A-817B-498F-A896-1E7C638B0097}")
public interface ICustomizationUsersGroups2 extends ICustomizationUsersGroups {
  // Methods:
  /**
   * <p>
   * Checks whether another group has the specified name.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @param groupId Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isNameValid(
          String name,
          int groupId);


  // Properties:
}
