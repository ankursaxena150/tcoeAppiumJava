package DDDD;

import com4j.DISPID;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Information about the current version including minor version.
 */
@IID("{F7858D86-0B62-4C72-A1CF-5E7712D3FD27}")
public interface IProductInfo2 extends IProductInfo {
  // Methods:
  /**
   * <p>
   * The build information for the installed version.
   * </p>
   * <p>
   * Getter method for the COM property "QCVersionEx"
   * </p>
   * @param pnMajorVersion Mandatory Holder<Integer> parameter.
   * @param pnMinorVersion Mandatory Holder<Integer> parameter.
   * @param pnMinorMinorVersion Mandatory Holder<Integer> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  int qcVersionEx(
          Holder<Integer> pnMajorVersion,
          Holder<Integer> pnMinorVersion,
          Holder<Integer> pnMinorMinorVersion);


  // Properties:
}
