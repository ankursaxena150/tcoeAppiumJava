package DDDD;

import com4j.*;

/**
 * Enhances the IBaseFactory interface to support mailing.
 */
@IID("{B1F47936-EFAC-4AEE-9876-8110B16F037D}")
public interface IBaseFactoryEx extends IBaseFactory {
  // Methods:
  /**
   * <p>
   * Mails the list of IBase Factory Items. 'Items' is a list of ID numbers.
   * </p>
   * @param items Mandatory java.lang.Object parameter.
   * @param sendTo Mandatory java.lang.String parameter.
   * @param sendCc Optional parameter. Default value is ""
   * @param option Optional parameter. Default value is 0
   * @param subject Optional parameter. Default value is ""
   * @param comment Optional parameter. Default value is ""
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  void mail(
          @MarshalAs(NativeType.VARIANT) Object items,
          String sendTo,
          @Optional @DefaultValue("") String sendCc,
          @Optional @DefaultValue("0") int option,
          @Optional @DefaultValue("") String subject,
          @Optional @DefaultValue("") String comment);


  // Properties:
}
