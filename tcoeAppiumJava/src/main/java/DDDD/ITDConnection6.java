package DDDD;

import com4j.*;

/**
 * Represents a single server connection.
 */
@IID("{5C346795-9EC4-49D2-ADCC-960E4210BBF0}")
public interface ITDConnection6 extends ITDConnection5 {
  // Methods:
  /**
   * <p>
   * Sets credentials for authentication on server.
   * </p>
   * @param userName Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(198) //= 0xc6. The runtime will prefer the VTID if present
  @VTID(203)
  void setServerCredentials(
          String userName,
          String password);


  /**
   * <p>
   * Sets credentials for authentication on proxy.
   * </p>
   * @param proxyHost Mandatory java.lang.String parameter.
   * @param port Mandatory int parameter.
   * @param userName Mandatory java.lang.String parameter.
   * @param password Mandatory java.lang.String parameter.
   */

  @DISPID(199) //= 0xc7. The runtime will prefer the VTID if present
  @VTID(204)
  void setProxyCredentials(
          String proxyHost,
          int port,
          String userName,
          String password);


  /**
   * <p>
   * The DesignStepFactory object for this connection.
   * </p>
   * <p>
   * Getter method for the COM property "DesignStepFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(200) //= 0xc8. The runtime will prefer the VTID if present
  @VTID(205)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject designStepFactory();


  // Properties:
}
