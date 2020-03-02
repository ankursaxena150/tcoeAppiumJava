package DDDD;

import com4j.Com4jObject;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. _ISupportGetChildrenLists Interface.
 */
@IID("{571138B3-FBBE-4B57-97F5-B61E325AEFBA}")
public interface _ISupportGetChildrenLists extends Com4jObject {
  // Methods:
  /**
   * <p>
   * For HP use. Returns children factory lists from the given parents
   * </p>
   * @param filter Mandatory DDDD.ITDFilter parameter.
   * @param parents Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @VTID(3)
  IList getChildrenLists(
          ITDFilter filter,
          IList parents);


  // Properties:
}
