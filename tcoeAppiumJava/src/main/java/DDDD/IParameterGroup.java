package DDDD;

import com4j.*;

/**
 * Obsolete. Do not use.
 */
@IID("{0F3BB8E6-1740-45C7-97AE-B7DBFD7B8229}")
public interface IParameterGroup extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The list of the IParameterGroupMembers that belong to the group.
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList members();


  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object members(
          int index);

  /**
   * <p>
   * The name of the group.
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String name();


  /**
   * <p>
   * The ID of the group.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int id();


  // Properties:
}
