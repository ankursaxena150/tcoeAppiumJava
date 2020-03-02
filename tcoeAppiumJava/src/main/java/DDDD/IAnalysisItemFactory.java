package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Services to manage analysis items.
 */
@IID("{E93A887B-8FBC-400E-8BD0-ECC2B064D7A5}")
public interface IAnalysisItemFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Returns the list of those AnalysisItem objects from the list that appear on dashboard pages.
   * </p>
   * @param pIdsList Mandatory DDDD.IList parameter.
   * @param inPublicPagesOnly Mandatory boolean parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IList getItemsIncludedInPages(
          IList pIdsList,
          boolean inPublicPagesOnly);


  // Properties:
}
