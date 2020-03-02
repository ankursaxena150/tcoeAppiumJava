package DDDD;

import com4j.*;

/**
 * Information about the current version.
 */
@IID("{2C8D6469-AE61-4F01-801E-6B2087216786}")
public interface IProductInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The build information for the installed version.
   * </p>
   * <p>
   * Getter method for the COM property "QCVersion"
   * </p>
   * @param pnMajorVersion Mandatory Holder<Integer> parameter.
   * @param pnMinorVersion Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int qcVersion(
          Holder<Integer> pnMajorVersion,
          Holder<Integer> pnMinorVersion);


  /**
   * <p>
   * The Business Process Tests versions.
   * </p>
   * <p>
   * Getter method for the COM property "BPTVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int bptVersion();


  // Properties:
}
