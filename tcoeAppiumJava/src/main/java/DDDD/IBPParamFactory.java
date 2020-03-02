package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Services for Business Process Tests.
 */
@IID("{172F7EB7-CF2B-45BF-A73E-4AE99580DD12}")
public interface IBPParamFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * For HP Use. Used to override the owner's version id for stateless factories.
   * </p>
   * <p>
   * Setter method for the COM property "OverrideOwnerVersionId"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  void overrideOwnerVersionId(
          int rhs);


  /**
   * <p>
   * For HP Use. Used to override the owner's baseline id for stateless factories.
   * </p>
   * <p>
   * Setter method for the COM property "OverrideOwnerBaselineId"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  void overrideOwnerBaselineId(
          int rhs);


  // Properties:
}
