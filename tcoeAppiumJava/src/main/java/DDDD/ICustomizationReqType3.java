package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Additional properties of the customization field.
 */
@IID("{57B6C56A-FD2E-48BB-8B6D-25B86211AB41}")
public interface ICustomizationReqType3 extends ICustomizationReqType2 {
  // Methods:
  /**
   * <p>
   * Rich text document template of the requirement type.
   * </p>
   * <p>
   * Getter method for the COM property "RichTextTemplate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(25)
  String richTextTemplate();


  /**
   * <p>
   * Rich text document template of the requirement type.
   * </p>
   * <p>
   * Setter method for the COM property "RichTextTemplate"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  void richTextTemplate(
          String pVal);


  // Properties:
}
