package DDDD;

import com4j.*;

/**
 * For HP use. Represents a graph or report.
 */
@IID("{BC8A6CFF-BBCB-4390-B1A0-199C93938FE2}")
public interface IAnalysisItem2 extends IAnalysisItem {
  // Methods:
  /**
   * <p>
   * The segment's id of the item
   * </p>
   * <p>
   * Getter method for the COM property "SegmentId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(41)
  int segmentId();


  /**
   * <p>
   * For HP use. The AnalysisItemFileFactory object for managing analysis item files.
   * </p>
   * <p>
   * Getter method for the COM property "AnalysisItemFileFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(42)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject analysisItemFileFactory();


  // Properties:
}
