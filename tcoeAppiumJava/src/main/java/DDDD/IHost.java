package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Represents a single host server. The ID of a host is its name.
 */
@IID("{F90E8FE5-EC4E-4EBA-8A81-32BCCEE3AB94}")
public interface IHost extends DDDD.IBaseField {
  // Methods:
  /**
   * <p>
   * A description of the host server.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  String description();


  /**
   * <p>
   * A description of the host server.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  void description(
          String pVal);


  /**
   * <p>
   * The remote execution server name as it appears on the LAN.
   * </p>
   * <p>
   * Getter method for the COM property "RexServer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  String rexServer();


  /**
   * <p>
   * The name of the host server.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  String name();


  // Properties:
}
