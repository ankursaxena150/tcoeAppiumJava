package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents a Dashboard Page.
 */
@IID("{59F98567-FDE0-4CBE-9DC4-2BC2F7EB9D4E}")
public interface IDashboardPage2 extends IDashboardPage {
  // Methods:
  /**
   * <p>
   * The ID of the page's segment.
   * </p>
   * <p>
   * Getter method for the COM property "SegmentId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(34)
  int segmentId();


  // Properties:
}
