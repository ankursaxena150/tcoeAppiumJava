package DDDD;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationUsersGroup objects.
 */
@IID("{1CD20510-7700-42B6-83AB-4AFC0419318D}")
public interface ICustomizationUsersGroups extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Adds a new CustomizationUsersGroup to the collection.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject addGroup(
          String name);


  /**
   * <p>
   * Gets the specified user group.
   * </p>
   * <p>
   * Getter method for the COM property "Group"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject group(
          String name);


  /**
   * <p>
   * Removes a CustomizationUsersGroup object.
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void removeGroup(
          String name);


  /**
   * <p>
   * The list of CustomizationUsersGroup objects.
   * </p>
   * <p>
   * Getter method for the COM property "Groups"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  IList groups();


  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object groups(
          int index);

  // Properties:
}
