package DDDD;

import com4j.*;

/**
 * Services for managing BP Models.
 */
@IID("{46F7D33E-46BF-4A90-9435-0834558D9165}")
public interface IBPModelFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Get the link between all the models in a project
   * </p>
   * <p>
   * Getter method for the COM property "BPModelNetworkLinks"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IList bpModelNetworkLinks();


  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object bpModelNetworkLinks(
          int index);

  // Properties:
}
