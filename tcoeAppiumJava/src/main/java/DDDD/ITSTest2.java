package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents an instance of a Tests in a test set.
 */
@IID("{133B9314-9A98-4659-866D-4BA8DCD4A643}")
public interface ITSTest2 extends ITSTest {
  // Methods:
  /**
   * <p>
   * Checks if the test instance covers at least one requirement.
   * </p>
   * <p>
   * Getter method for the COM property "HasCoverage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(41)
  boolean hasCoverage();


  // Properties:
}
