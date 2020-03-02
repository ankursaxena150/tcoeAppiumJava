package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. IReportManager2 Interface.
 */
@IID("{A833A880-8476-11E0-9D78-0800200C9A66}")
public interface IReportManager2 extends IReportManager {
  // Methods:
  /**
   * <p>
   * Invokes a task that generates a zipped report file on the server.
   * </p>
   * @param analysisItemId Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(17)
  int startGenerateReportZipped(
          int analysisItemId);


  /**
   * <p>
   * Invokes a task that generates a zipped report file on the server by sending a full configuration XML to the server.
   * </p>
   * @param reportConfigXml Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(18)
  int startGenerateVirtualReportZipped(
          String reportConfigXml);


  /**
   * <p>
   * Decline report file downloads
   * </p>
   * @param reportFileName Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(19)
  void declineDownloadReport(
          String reportFileName);


  // Properties:
}
