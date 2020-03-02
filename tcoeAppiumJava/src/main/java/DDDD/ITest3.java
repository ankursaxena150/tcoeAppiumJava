package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a planning test.
 */
@IID("{940B7155-A361-416F-B892-D58BCFC4E1C6}")
public interface ITest3 extends ITest2 {
  // Methods:
  /**
   * <p>
   * The test folder ID.
   * </p>
   * <p>
   * Getter method for the COM property "FolderId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(53)
  int folderId();


  // Properties:
}
