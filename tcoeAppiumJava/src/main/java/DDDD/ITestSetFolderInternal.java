package DDDD;

import com4j.Com4jObject;
import com4j.Holder;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Tests set folder Internal functionality.
 */
@IID("{19F5C80C-DB4A-48B0-9EE8-AE0AE3090D89}")
public interface ITestSetFolderInternal extends Com4jObject {
  // Methods:
  /**
   * @param pAll Mandatory Holder<Integer> parameter.
   * @param pNotExecuted Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void getInstancesInformation(
          Holder<Integer> pAll,
          Holder<Integer> pNotExecuted);


  // Properties:
}
