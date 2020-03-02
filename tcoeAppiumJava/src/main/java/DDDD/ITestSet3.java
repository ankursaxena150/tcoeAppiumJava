package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a series of tests to be run as a group to meet a specific testing goal.
 */
@IID("{3C4D6CF8-D645-482B-AD1A-9665FD642A42}")
public interface ITestSet3 extends ITestSet2 {
  // Methods:
  /**
   * <p>
   * The test set folder ID.
   * </p>
   * <p>
   * Getter method for the COM property "FolderId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(44)
  int folderId();


  // Properties:
}
