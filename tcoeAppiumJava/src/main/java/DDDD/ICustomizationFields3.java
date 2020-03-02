package DDDD;

import com4j.*;

/**
 * Services for managing the collection of all CustomizationField objects in the project.
 */
@IID("{AB9F30CA-EEAA-427C-9392-70DF75DC457D}")
public interface ICustomizationFields3 extends ICustomizationFields2 {
  // Methods:
  /**
   * <p>
   * [for HP use only] TEMPORARY API - will be changed soon - add a special transient field. returns the CustomizationField object representing the field.
   * </p>
   * @param tableName Mandatory java.lang.String parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   * @param labelName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject addTransientField(
          String tableName,
          String fieldName,
          String labelName);


  /**
   * <p>
   * [for HP use only] TEMPORARY API - will be changed soon - remove the given transient field from  the given table.
   * </p>
   * @param tableName Mandatory java.lang.String parameter.
   * @param fieldName Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void removeTransientField(
          String tableName,
          String fieldName);


  // Properties:
}
