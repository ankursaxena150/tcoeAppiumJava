package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services for managing requirements.
 */
@IID("{143F4C8E-A1FF-45B5-A1CA-B83E71722BB8}")
public interface IReqFactory6 extends IReqFactory5 {
  // Methods:
  /**
   * <p>
   * Get the coverage analysis last calculation time.
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(45)
  java.util.Date getCoverageAnalysisCalculationTime();


  /**
   * <p>
   * Refresh the coverage analysis route talbe.
   * </p>
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(46)
  void refreshRoute();


  // Properties:
}
