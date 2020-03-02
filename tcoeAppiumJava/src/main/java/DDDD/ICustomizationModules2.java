package DDDD;

import com4j.*;

/**
 * Services for managing the customization modules.
 */
@IID("{3A2F36D9-0CEF-4864-A067-7246D6615D9E}")
public interface ICustomizationModules2 extends ICustomizationModules {
  // Methods:
  /**
   * <p>
   * Indicates if the specified module is visible in the UI to the specified user group.
   * </p>
   * <p>
   * Getter method for the COM property "IsVisibleForGroup"
   * </p>
   * @param moduleID Mandatory int parameter.
   * @param group Mandatory java.lang.Object parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isVisibleForGroup(
          int moduleID,
          @MarshalAs(NativeType.VARIANT) Object group);


  /**
   * <p>
   * Indicates if the specified module is visible in the UI to the specified user group.
   * </p>
   * <p>
   * Setter method for the COM property "IsVisibleForGroup"
   * </p>
   * @param moduleID Mandatory int parameter.
   * @param group Mandatory java.lang.Object parameter.
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(16)
  void isVisibleForGroup(
          int moduleID,
          @MarshalAs(NativeType.VARIANT) Object group,
          boolean pVal);


  /**
   * <p>
   * The list of the user groups to which the specified module is visible in the UI.
   * </p>
   * <p>
   * Getter method for the COM property "VisibleForGroups"
   * </p>
   * @param moduleID Mandatory int parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  IList visibleForGroups(
          int moduleID);


  // Properties:
}
