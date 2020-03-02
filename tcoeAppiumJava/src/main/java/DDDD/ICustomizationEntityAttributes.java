package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents an entity attribute.
 */
@IID("{1F32CB1E-3A39-41FF-93D0-ED827995DC98}")
public interface ICustomizationEntityAttributes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Gets the list of all ICustomizationEntityAttribute for the specified entity.
   * </p>
   * @param entityType Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList getEntityAttributes(
          String entityType);


  // Properties:
}
