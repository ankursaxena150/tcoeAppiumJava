package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents a result files manipulation API.
 */
@IID("{BB5AAC39-93F7-4BA2-851E-145598E447D5}")
public interface IResultStorage extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Removes Result files from QC Repository
   * </p>
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void clean();


  /**
   * <p>
   * Uploads result file/folder to QC Repository
   * </p>
   * @param resultLocalPath Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void uploadResult(
          String resultLocalPath);


  /**
   * <p>
   * Downloads result folder from QC Repository
   * </p>
   * @param resultLocalPath Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void downloadResult(
          String resultLocalPath);


  // Properties:
}
