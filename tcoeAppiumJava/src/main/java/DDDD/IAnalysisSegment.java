package DDDD;

import com4j.*;

/**
 * For HP use. Services to manage analysis item folders.
 */
@IID("{F4075F1C-A77D-41DD-B2AD-ACDA605DE11D}")
public interface IAnalysisSegment extends IBaseField {
  // Methods:
  /**
   * <p>
   * Segment's extension
   * </p>
   * <p>
   * Getter method for the COM property "Extension"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  String extension();


  /**
   * <p>
   * The analysis segment's name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(21)
  String name();


  /**
   * <p>
   * Indicates whether this is a public segment.
   * </p>
   * <p>
   * Getter method for the COM property "Public"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(22)
  boolean _public();


  /**
   * <p>
   * The Analysis Folder object for root folder of the segment.
   * </p>
   * <p>
   * Getter method for the COM property "AnalysisRootFolder"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject analysisRootFolder();


  /**
   * <p>
   * The Dashboard Folder object for root folder of the segment.
   * </p>
   * <p>
   * Getter method for the COM property "DashboardRootFolder"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject dashboardRootFolder();


  // Properties:
}
