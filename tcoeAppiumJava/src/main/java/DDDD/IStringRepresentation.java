package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * The string representation of the object.
 */
@IID("{B1DF17B2-7243-40FA-B423-1566A1988246}")
public interface IStringRepresentation extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The string representation of the object.
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String toString_();


  // Properties:
}
