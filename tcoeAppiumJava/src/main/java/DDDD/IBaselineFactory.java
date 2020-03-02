package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Services for managing baselines.
 */
@IID("{3D7543C1-9B84-457E-9A1A-CCB7D20663FA}")
public interface IBaselineFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * A list of IBaselineItem objects in which the entity participated.
   * </p>
   * @param pEntity Mandatory DDDD.IBaseField parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IList baselineItems(
          IBaseField pEntity);


  // Properties:
}
