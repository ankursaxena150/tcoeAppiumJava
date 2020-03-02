package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services to manage QC resources.
 */
@IID("{8C605908-42D1-4C83-A974-7AAA039111DC}")
public interface IQCResourceFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * For HP use. Overrides the owner's baseline ID for stateless factories.
   * </p>
   * <p>
   * Setter method for the COM property "OverrideOwnerBaselineId"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  void overrideOwnerBaselineId(
          int rhs);


  // Properties:
}
