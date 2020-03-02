package DDDD;

import com4j.*;

/**
 * For HP use. Services for managing libraries.
 */
@IID("{8C7F6E7D-5596-4429-A9E6-075ABABF9F8B}")
public interface ILibraryFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Add a new Imported Library Item. This will create the item and pre-connect it to the 'Created From' Library. Note: A valid folder id must be passed in ItemData if this factory was retrieved from the connection.
   * </p>
   * @param domain Mandatory java.lang.String parameter.
   * @param project Mandatory java.lang.String parameter.
   * @param libraryName Mandatory java.lang.String parameter.
   * @param libraryID Mandatory int parameter.
   * @param baselineName Mandatory java.lang.String parameter.
   * @param baselineId Mandatory int parameter.
   * @param itemData Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject addImportedItem(
          String domain,
          String project,
          String libraryName,
          int libraryID,
          String baselineName,
          int baselineId,
          @Optional @MarshalAs(NativeType.VARIANT) Object itemData);


  /**
   * <p>
   * Returns the list of the entities' table names which can be a library part.
   * </p>
   * <p>
   * Getter method for the COM property "LibraryPartsEntitiesTables"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  IList libraryPartsEntitiesTables();


  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object libraryPartsEntitiesTables(
          int index);

  // Properties:
}
