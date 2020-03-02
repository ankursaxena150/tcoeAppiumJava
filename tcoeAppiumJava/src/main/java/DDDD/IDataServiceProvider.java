package DDDD;

import com4j.*;

/**
 * For HP use. Interface providing project data related services.
 */
@IID("{4EA0B972-9132-4485-90BE-AE502F08F784}")
public interface IDataServiceProvider extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Create instance of object according by its type and ID.
   * </p>
   * <p>
   * Getter method for the COM property "ItemByTypeAndId"
   * </p>
   * @param objectType Mandatory int parameter.
   * @param objectId Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject itemByTypeAndId(
          int objectType,
          int objectId);


  /**
   * <p>
   * Create instance of object according by its type and ID.
   * </p>
   * <p>
   * Getter method for the COM property "ItemByTableNameAndId"
   * </p>
   * @param objectType Mandatory java.lang.String parameter.
   * @param objectId Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject itemByTableNameAndId(
          String objectType,
          int objectId);


  /**
   * <p>
   * Converts object type to name.
   * </p>
   * @param objectType Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  String convertObjectTypeToName(
          int objectType);


  /**
   * <p>
   * Converts entity key xid/variant to entity ID which is long.
   * </p>
   * @param key Mandatory java.lang.Object parameter.
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int getIDFromEntityKey(
          @MarshalAs(NativeType.VARIANT) Object key);


  // Properties:
}
