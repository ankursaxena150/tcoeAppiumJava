package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * For HP use. Represents a Library Part.
 */
@IID("{E746272C-4CB9-4691-AF22-F857580DAA44}")
public interface ILibraryPart extends IBaseField {
  // Methods:
  /**
   * <p>
   * The library part name.
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
   * The library part name.
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
   * The library part EntityType, for example, TestFolder.
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
   * The library part EntityType, for example, TestFolder.
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
   * The library part EntityKey.
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
   * The library part EntityKey.
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
   * The library part Export Filter.
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
   * The library part Export Filter.
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


  // Properties:
}
