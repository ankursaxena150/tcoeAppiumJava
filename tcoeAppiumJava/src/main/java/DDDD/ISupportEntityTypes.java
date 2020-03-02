package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Provides services for entities that support entity types.
 */
@IID("{CAFABBC2-CE43-48CD-A6AC-2DBDA404C076}")
public interface ISupportEntityTypes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The list of fields for the given type.
   * </p>
   * @param typeId Mandatory java.lang.String parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList getTypedFields(
          String typeId);


  /**
   * <p>
   * Indicates whether the field is used in this type.
   * </p>
   * @param field Mandatory java.lang.String parameter.
   * @param typeId Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isFieldRelevantToType(
          String field,
          String typeId);


  /**
   * <p>
   * Indicates whether the field is required in this type.
   * </p>
   * @param field Mandatory java.lang.String parameter.
   * @param typeId Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isFieldRequiredInType(
          String field,
          String typeId);


  // Properties:
}
