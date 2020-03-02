package DDDD;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

/**
 * Extends IBaseFactory
 */
@IID("{33A6EC9D-8D08-4598-AD39-A614D9409ECC}")
public interface _IFactorySupportBatchLock extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Locks the given items.
   * </p>
   * @param entities Mandatory DDDD.IList parameter.
   */

  @VTID(3)
  void lockList(
          IList entities);


  // Properties:
}
