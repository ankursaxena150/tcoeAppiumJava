package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. The properties of an extension as they appear in the extension.xml file.
 */
@IID("{C5A96238-6728-4F3E-AC98-612803CB11A9}")
public interface IExtensionData2 extends IExtensionData1 {
  // Methods:
  /**
   * <p>
   * The extension's full version.
   * </p>
   * <p>
   * Getter method for the COM property "FullVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  String fullVersion();


  // Properties:
}
