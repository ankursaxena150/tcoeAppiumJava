package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services for Business Process Iteration.
 */
@IID("{96AAFA0E-68E9-49BC-AF40-2A4BA86223B8}")
public interface IBPIterationParamFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * For HP use. Overrides the owner's version ID for stateless factories.
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
   * For HP use. Overrides the owner's baseline ID for stateless factories.
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
