package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Provides services for entities that support parametererisation.
 */
@IID("{1E57BFE9-717E-461E-97F1-8E7F2AA75F44}")
public interface ISupportTestParameters extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The Parameter factory that manages the parameters of the current object.
   * </p>
   * <p>
   * Getter method for the COM property "TestParameterFactory"
   * </p>
   * @return  Returns a value of type DDDD.ITestParameterFactory
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  ITestParameterFactory testParameterFactory();


  /**
   * <p>
   * For HP use. This property returns true if entity supports test parameters.
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isTestParametersSupported();


  /**
   * <p>
   * TDM Obsolete. Do not invoke.
   * </p>
   * <p>
   * Getter method for the COM property "IsTestClass"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isTestClass();


  /**
   * <p>
   * TDM Obsolete. Do not invoke.
   * </p>
   * <p>
   * Setter method for the COM property "IsTestClass"
   * </p>
   * @param pVal Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  void isTestClass(
          boolean pVal);


  // Properties:
}
