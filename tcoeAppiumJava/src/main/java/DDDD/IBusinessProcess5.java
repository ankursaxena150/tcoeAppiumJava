package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a single Business Process Tests.
 */
@IID("{4F006939-1B8E-4F93-B22A-5CFFF8BEC098}")
public interface IBusinessProcess5 extends IBusinessProcess4 {
  // Methods:
  /**
   * <p>
   * Generates an XML description of the BPT.
   * </p>
   * @param showDesignSteps Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(84)
  String generateXMLDescription(
          boolean showDesignSteps);


  // Properties:
}
