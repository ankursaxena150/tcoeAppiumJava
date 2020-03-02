package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents a Dashboard folder.
 */
@IID("{2113F5C3-582E-4A9C-BB4F-BBC2C353F63D}")
public interface IDashboardFolder2 extends IDashboardFolder {
  // Methods:
  /**
   * <p>
   * The ID of folder's segment.
   * </p>
   * <p>
   * Getter method for the COM property "SegmentId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  int segmentId();


  // Properties:
}
