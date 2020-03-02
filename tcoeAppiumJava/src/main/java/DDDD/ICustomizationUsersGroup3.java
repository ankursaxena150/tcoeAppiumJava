package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Additional properties of the customization field.
 */
@IID("{78B759EA-C483-4AFD-961A-AEFCB3B2EB3D}")
public interface ICustomizationUsersGroup3 extends ICustomizationUsersGroup2 {
  // Methods:
  /**
   * <p>
   * The user group name used as the source group when creating a new group.
   * </p>
   * <p>
   * Getter method for the COM property "SourceGroupName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  String sourceGroupName();


  /**
   * <p>
   * The user group name used as the source group when creating a new group.
   * </p>
   * <p>
   * Setter method for the COM property "SourceGroupName"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(23)
  void sourceGroupName(
          String pVal);


  // Properties:
}
