package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Export Interface.
 */
@IID("{08E8895B-686D-4F75-9F16-F9E130D99470}")
public interface IExport extends Com4jObject {
  // Methods:
  /**
   * <p>
   * method ExportData.
   * </p>
   * @param xmlData Mandatory java.lang.String parameter.
   * @param resourceId Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void exportData(
          String xmlData,
          String resourceId);


  // Properties:
}
