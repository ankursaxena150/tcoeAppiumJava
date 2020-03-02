package DDDD;

import com4j.*;

/**
 * Represents a basic data field or entity, such as an attachment. Use the properties and methods to perform  field-related actions, such as setting and refreshing field values.
 */
@IID("{8937B744-DE14-4E34-9A56-4E9E308B1863}")
public interface IBaseFieldEx extends IBaseField {
  // Methods:
  /**
   * <p>
   * Obsolete. Use IAuditable.AuditRecordFactory
   * </p>
   * <p>
   * Getter method for the COM property "History"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject history();


  /**
   * <p>
   * The Attachment factory for the object.
   * </p>
   * <p>
   * Getter method for the COM property "Attachments"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject attachments();


  /**
   * <p>
   * Checks if the object has one or more attachments.
   * </p>
   * <p>
   * Getter method for the COM property "HasAttachment"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  boolean hasAttachment();


  // Properties:
}
