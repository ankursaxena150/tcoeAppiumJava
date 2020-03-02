package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Deprecated. Use ITestLabFolder. Manages the tests and test sets included in one test set folder.
 */
@IID("{FD6F1981-CB3C-4109-AB10-D4A23B8F6937}")
public interface ITestSetFolder4 extends ITestSetFolder3 {
  // Methods:
  /**
   * <p>
   * The filter on the test set objects in the tree.
   * </p>
   * <p>
   * Getter method for the COM property "TestSetFilter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(41)
  String testSetFilter();


  /**
   * <p>
   * The filter on the test set objects in the tree.
   * </p>
   * <p>
   * Setter method for the COM property "TestSetFilter"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(42)
  void testSetFilter(
          String pVal);


  // Properties:
}
