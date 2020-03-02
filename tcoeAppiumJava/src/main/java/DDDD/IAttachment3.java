package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a single file or Internet address attached to a field object.
 */
@IID("{ACA3EE6C-9D33-47E0-9AE1-629C27601A8E}")
public interface IAttachment3 extends IAttachment {
  // Methods:
  /**
   * <p>
   * The attachment file size in bytes.
   * </p>
   * <p>
   * Getter method for the COM property "FileSizeEx"
   * </p>
   * @return  Returns a value of type long
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(36)
  long fileSizeEx();


  // Properties:
}
