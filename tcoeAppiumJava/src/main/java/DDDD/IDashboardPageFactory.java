package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Services to manage Dashboard Pages.
 */
@IID("{1001E71F-5744-4624-8000-633698EB940D}")
public interface IDashboardPageFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Returns those dashboard page objects from the specified ID list that include private analysis items.
   * </p>
   * @param pIdsList Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IList getPagesWithPrivateItems(
          IList pIdsList);


  // Properties:
}
