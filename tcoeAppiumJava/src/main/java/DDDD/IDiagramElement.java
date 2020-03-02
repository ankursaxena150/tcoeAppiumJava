package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Diagram Element.
 */
@IID("{BE5ECE3E-0E00-42F1-B25E-BF091BAC4882}")
public interface IDiagramElement extends DDDD.IBaseFieldExMail {
  // Methods:
  /**
   * <p>
   * The Diagram Element's name
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  String name();


  /**
   * <p>
   * The Diagram Element's name
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  void name(
          String pVal);


  /**
   * <p>
   * The Diagram Element's element.
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
  String description();


  /**
   * <p>
   * The Diagram Element's element.
   * </p>
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param pVal Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(27)
  void description(
          String pVal);


  // Properties:
}
