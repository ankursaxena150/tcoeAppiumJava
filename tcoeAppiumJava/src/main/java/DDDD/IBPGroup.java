package DDDD;

import com4j.*;

/**
 * Deprecated. Use BPComponentFactory of IBPComponent2. Support for grouping business components so that they iterate as a unit.
 */
@IID("{DB466018-78FF-4645-9B45-B32F823C07F3}")
public interface IBPGroup extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The list of the BPComponents that belong to the group.
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList bpComponents();


  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object bpComponents(
          int index);

  /**
   * <p>
   * Adds the specified business component to the group.
   * </p>
   * @param pBPComponent Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void addBPComponent(
          @MarshalAs(NativeType.Dispatch) Com4jObject pBPComponent);


  /**
   * <p>
   * Removes the specified business component from the group.
   * </p>
   * @param pBPComponent Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void deleteBPComponent(
          @MarshalAs(NativeType.Dispatch) Com4jObject pBPComponent);


  /**
   * <p>
   * The group ID.
   * </p>
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int id();


  // Properties:
}
