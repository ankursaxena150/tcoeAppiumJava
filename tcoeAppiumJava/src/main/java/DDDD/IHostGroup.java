package DDDD;

import com4j.*;

/**
 * Services for managing a group of host servers.
 */
@IID("{B3468A97-FD4C-4A05-9E49-1FD0ED7FD9E2}")
public interface IHostGroup extends DDDD.IBaseFieldEx {
  // Methods:
  /**
   * <p>
   * Gets the host group name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  String name();


  /**
   * <p>
   * Adds a host to the group.
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  void addHost(
          @MarshalAs(NativeType.VARIANT) Object val);


  /**
   * <p>
   * Removes the specified host from the group.
   * </p>
   * @param val Mandatory java.lang.Object parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void removeHost(
          @MarshalAs(NativeType.VARIANT) Object val);


  /**
   * <p>
   * Gets a list of all hosts in the group.
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  IList newList();


  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object newList(
          int index);

  // Properties:
}
