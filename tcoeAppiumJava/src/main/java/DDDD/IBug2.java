package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a defect.
 */
@IID("{5E515E90-FE9B-420A-8F8B-ECA5EFA63E4E}")
public interface IBug2 extends IBug {
  // Methods:
  /**
   * <p>
   * The ID of the Subject field.
   * </p>
   * <p>
   * Getter method for the COM property "SubjectId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(39)
  int subjectId();


  // Properties:
}
