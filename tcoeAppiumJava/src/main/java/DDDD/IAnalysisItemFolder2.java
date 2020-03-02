package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents an Analysis Item Folder.
 */
@IID("{7400E335-F971-4F31-8CC5-CF6974FAFFD6}")
public interface IAnalysisItemFolder2 extends IAnalysisItemFolder {
  // Methods:
  /**
   * <p>
   * The folder's segment id.
   * </p>
   * <p>
   * Getter method for the COM property "SegmentId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  int segmentId();


  // Properties:
}
