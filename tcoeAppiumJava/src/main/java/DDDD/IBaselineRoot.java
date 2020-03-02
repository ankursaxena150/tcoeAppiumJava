package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents a Baseline Root
 */
@IID("{F488163A-8369-4879-8F57-FB3C534D56C8}")
public interface IBaselineRoot extends IBaseField {
  // Methods:
  /**
   * <p>
   * The baseline root name
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(20)
  String name();


  /**
   * <p>
   * The baseline root name
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(21)
  void name(
          String pVal);


  /**
   * <p>
   * The baseline root EntityType (e.g TestFolder 
   * </p>
   * <p>
   * Getter method for the COM property "EntityType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(22)
  String entityType();


  /**
   * <p>
   * The baseline root EntityType (e.g TestFolder 
   * </p>
   * <p>
   * Setter method for the COM property "EntityType"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  void entityType(
          String pVal);


  /**
   * <p>
   * The baseline root EntityKey
   * </p>
   * <p>
   * Getter method for the COM property "EntityKey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(24)
  String entityKey();


  /**
   * <p>
   * The baseline root EntityKey
   * </p>
   * <p>
   * Setter method for the COM property "EntityKey"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void entityKey(
          String pVal);


  /**
   * <p>
   * The baseline root Export Filter
   * </p>
   * <p>
   * Getter method for the COM property "EntityExpFilter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  String entityExpFilter();


  /**
   * <p>
   * The baseline root Export Filter
   * </p>
   * <p>
   * Setter method for the COM property "EntityExpFilter"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
  void entityExpFilter(
          String pVal);


  /**
   * <p>
   * The baseline root obsolete value
   * </p>
   * <p>
   * Getter method for the COM property "IsObsolete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  boolean isObsolete();


  // Properties:
}
