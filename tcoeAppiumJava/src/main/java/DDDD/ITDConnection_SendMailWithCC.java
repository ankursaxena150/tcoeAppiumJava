package DDDD;

import com4j.*;

/**
 * Send Email
 */
@IID("{E78B2EA2-0E06-4DCF-A676-4747F885BE15}")
public interface ITDConnection_SendMailWithCC extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Sends Mail.
   * </p>
   * @param sendTo Mandatory java.lang.String parameter.
   * @param ccTo Mandatory java.lang.String parameter.
   * @param sendFrom Optional parameter. Default value is ""
   * @param subject Optional parameter. Default value is ""
   * @param message Optional parameter. Default value is ""
   * @param attachArray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bsFormat Optional parameter. Default value is ""
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(3)
  void sendMailWithCC(
          String sendTo,
          String ccTo,
          @Optional @DefaultValue("") String sendFrom,
          @Optional @DefaultValue("") String subject,
          @Optional @DefaultValue("") String message,
          @Optional @MarshalAs(NativeType.VARIANT) Object attachArray,
          @Optional @DefaultValue("") String bsFormat);


  // Properties:
}
