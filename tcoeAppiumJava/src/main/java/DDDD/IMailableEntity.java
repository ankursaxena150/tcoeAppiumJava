package DDDD;

import com4j.*;

/**
 * Mail support for entities.
 */
@IID("{8F9CBE86-441D-40FD-9ECE-24BFADF8931D}")
public interface IMailableEntity extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Mails the item.
   * </p>
   * @param sendTo Mandatory java.lang.String parameter.
   * @param sendCc Optional parameter. Default value is ""
   * @param option Optional parameter. Default value is 0
   * @param subject Optional parameter. Default value is ""
   * @param comment Optional parameter. Default value is ""
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void mail(
          String sendTo,
          @Optional @DefaultValue("") String sendCc,
          @Optional @DefaultValue("0") int option,
          @Optional @DefaultValue("") String subject,
          @Optional @DefaultValue("") String comment);


  /**
   * <p>
   * Mails the IMailableEntity field item.
   * </p>
   * @param sendTo Mandatory java.lang.String parameter.
   * @param sendCc Optional parameter. Default value is ""
   * @param sendBcc Optional parameter. Default value is ""
   * @param option Optional parameter. Default value is 0
   * @param subject Optional parameter. Default value is ""
   * @param priority Optional parameter. Default value is 3
   * @param comment Optional parameter. Default value is ""
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void mailEx(
          String sendTo,
          @Optional @DefaultValue("") String sendCc,
          @Optional @DefaultValue("") String sendBcc,
          @Optional @DefaultValue("0") int option,
          @Optional @DefaultValue("") String subject,
          @Optional @DefaultValue("3") DDDD.TDAPI_MAIL_PRIORITIES priority,
          @Optional @DefaultValue("") String comment);


  // Properties:
}
