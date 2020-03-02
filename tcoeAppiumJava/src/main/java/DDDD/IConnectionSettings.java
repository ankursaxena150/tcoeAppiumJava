package DDDD;

import com4j.*;

/**
 * IConnectionSettings interface
 */
@IID("{CCEAF06E-3EC5-4687-90FD-4FE39EE31868}")
public interface IConnectionSettings extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Set proxy settings
   * </p>
   * @param url Mandatory java.lang.String parameter.
   * @param port Mandatory int parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void setProxy(
          String url,
          int port);


  /**
   * <p>
   * Set proxy settings
   * </p>
   * @param pUrl Mandatory Holder<java.lang.String> parameter.
   * @param pPort Mandatory Holder<Integer> parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void getProxy(
          Holder<String> pUrl,
          Holder<Integer> pPort);


  /**
   * <p>
   * Set proxy credentials
   * </p>
   * @param login Mandatory java.lang.String parameter.
   * @param pass Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void setProxyCredentials(
          String login,
          String pass);


  /**
   * <p>
   * Set server settings
   * </p>
   * @param login Mandatory java.lang.String parameter.
   * @param pass Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void setWebServerCredentials(
          String login,
          String pass);


  /**
   * <p>
   * Set cookie
   * </p>
   * @param cookie Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void setCookie(
          String cookie);


  /**
   * <p>
   * Set client certificate, the parameter should be valid CERT_CONTEXT structure.
   * </p>
   * <p>
   * Setter method for the COM property "ClientCert"
   * </p>
   * @param pCertContext Mandatory java.lang.Object parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  void clientCert(
          @MarshalAs(NativeType.VARIANT) Object pCertContext);


  /**
   * <p>
   * Set client certificate, the parameter should be valid CERT_CONTEXT structure.
   * </p>
   * <p>
   * Getter method for the COM property "ClientCert"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  Object clientCert();


  /**
   * <p>
   * Set execution mode
   * </p>
   * <p>
   * Setter method for the COM property "ExecutionMode"
   * </p>
   * @param pExecutionMode Mandatory DDDD.TDAPI_EXECUTION_MODES parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  void executionMode(
          DDDD.TDAPI_EXECUTION_MODES pExecutionMode);


  /**
   * <p>
   * Set execution mode
   * </p>
   * <p>
   * Getter method for the COM property "ExecutionMode"
   * </p>
   * @return  Returns a value of type DDDD.TDAPI_EXECUTION_MODES
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  DDDD.TDAPI_EXECUTION_MODES executionMode();


  /**
   * <p>
   * Set force auth header param
   * </p>
   * <p>
   * Setter method for the COM property "BasicAuthHeaderMode"
   * </p>
   * @param pForceAuthHeader Mandatory DDDD.TDAPI_BASIC_AUTH_HEADER_MODES parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  void basicAuthHeaderMode(
          DDDD.TDAPI_BASIC_AUTH_HEADER_MODES pForceAuthHeader);


  /**
   * <p>
   * Set force auth header param
   * </p>
   * <p>
   * Getter method for the COM property "BasicAuthHeaderMode"
   * </p>
   * @return  Returns a value of type DDDD.TDAPI_BASIC_AUTH_HEADER_MODES
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  DDDD.TDAPI_BASIC_AUTH_HEADER_MODES basicAuthHeaderMode();


  /**
   * <p>
   * Set client certificate keys (bytes of SerialNumber&Issuer)
   * </p>
   * @param certSN Mandatory java.lang.Object parameter.
   * @param certIss Mandatory java.lang.Object parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  void setCurrentCertificateKeys(
          @MarshalAs(NativeType.VARIANT) Object certSN,
          @MarshalAs(NativeType.VARIANT) Object certIss);


  /**
   * <p>
   * Get client certificate keys (bytes of SerialNumber&Issuer)
   * </p>
   * @param pCertSN Mandatory java.lang.Object parameter.
   * @param pCertIss Mandatory java.lang.Object parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  void getCurrentCertificateKeys(
          Object pCertSN,
          Object pCertIss);


  /**
   * <p>
   * Use instance cache of settings storages
   * </p>
   * <p>
   * Setter method for the COM property "UseInstanceCache"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  void useInstanceCache(
          boolean pVal);


  /**
   * <p>
   * Use instance cache of settings storages
   * </p>
   * <p>
   * Getter method for the COM property "UseInstanceCache"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  boolean useInstanceCache();


  /**
   * <p>
   * Get copy object
   * </p>
   * @return  Returns a value of type DDDD.IConnectionSettings
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  IConnectionSettings cloneTo();


  // Properties:
}
