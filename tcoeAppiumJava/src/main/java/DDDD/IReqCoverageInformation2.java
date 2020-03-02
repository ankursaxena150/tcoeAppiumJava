package DDDD;

import com4j.*;

/**
 * Services for managing requirement coverage information.
 */
@IID("{16075B49-4CDD-4E6A-B60C-5D2D13BCCE90}")
public interface IReqCoverageInformation2 extends IReqCoverageInformation {
  // Methods:
  /**
   * <p>
   * For HP use. Returns the amount of covering enitities according to their status.
   * </p>
   * @param reqFilter Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  Object getCoverageEntitiesSummaryByCoverageFilter(
          String reqFilter);


  // Properties:
}
