package DDDD;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{78B80912-E383-4CF7-99E3-BEB03AFBDC79}")
public interface ITDConnection8 extends ITDConnection7 {
  // Methods:
  /**
   * <p>
   * Sends mail with options.
   * </p>
   * @param sendTo Mandatory java.lang.String parameter.
   * @param sendFrom Optional parameter. Default value is ""
   * @param subject Optional parameter. Default value is ""
   * @param message Optional parameter. Default value is ""
   * @param option Optional parameter. Default value is 0
   * @param attachArray Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bsFormat Optional parameter. Default value is ""
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(216)
  void sendMailEx(
          String sendTo,
          @Optional @DefaultValue("") String sendFrom,
          @Optional @DefaultValue("") String subject,
          @Optional @DefaultValue("") String message,
          @Optional @DefaultValue("0") int option,
          @Optional @MarshalAs(NativeType.VARIANT) Object attachArray,
          @Optional @DefaultValue("") String bsFormat);


  /**
   * <p>
   * Sends a text message in ALM HTML format, with options.
   * </p>
   * @param sendTo Mandatory java.lang.String parameter.
   * @param sendFrom Optional parameter. Default value is ""
   * @param subject Optional parameter. Default value is ""
   * @param message Optional parameter. Default value is ""
   * @param option Optional parameter. Default value is 0
   * @param attachArray Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(217)
  void sendFramedMailEx(
          String sendTo,
          @Optional @DefaultValue("") String sendFrom,
          @Optional @DefaultValue("") String subject,
          @Optional @DefaultValue("") String message,
          @Optional @DefaultValue("0") int option,
          @Optional @MarshalAs(NativeType.VARIANT) Object attachArray);


  /**
   * <p>
   * The major, minor, minor-minor versions and build number of the OTA API.
   * </p>
   * @param pbsMajorVersion Mandatory Holder<java.lang.String> parameter.
   * @param pbsMinorVersion Mandatory Holder<java.lang.String> parameter.
   * @param pbsMinorMinorVersion Mandatory Holder<java.lang.String> parameter.
   * @param pbsBuildNum Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(218)
  void getTDVersionEx(
          Holder<String> pbsMajorVersion,
          Holder<String> pbsMinorVersion,
          Holder<String> pbsMinorMinorVersion,
          Holder<String> pbsBuildNum);


  // Properties:
}
