package DDDD;

import com4j.*;

/**
 * For HP use. Services for managing customization permissions.
 */
@IID("{C5F2DD90-484A-48B3-874F-9BFF5C14AC67}")
public interface ICustomizationPermissionService extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Checks whether the currently connected user can add the specified type of entity.
   * </p>
   * @param tableName Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void verifyAddItem(
          String tableName);


  /**
   * <p>
   * Checks whether the currently connected user can remove the specified type of entity.
   * </p>
   * @param pBaseField Mandatory DDDD.IBaseField parameter.
   * @param tableName Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void verifyRemoveItem(
          IBaseField pBaseField,
          String tableName);


  /**
   * <p>
   * Field owner.
   * </p>
   * <p>
   * Getter method for the COM property "FieldOwner"
   * </p>
   * @param pBaseField Mandatory DDDD.IBaseField parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  String fieldOwner(
          IBaseField pBaseField);


  /**
   * <p>
   * Checks whether the currently connected user can modify the specified type of entity.
   * </p>
   * <p>
   * Getter method for the COM property "CanModifyField"
   * </p>
   * @param entityName Mandatory java.lang.String parameter.
   * @param field Mandatory java.lang.Object parameter.
   * @param group Mandatory java.lang.Object parameter.
   * @param userSpecific Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int canModifyField(
          String entityName,
          @MarshalAs(NativeType.VARIANT) Object field,
          @MarshalAs(NativeType.VARIANT) Object group,
          boolean userSpecific);


  // Properties:
}
