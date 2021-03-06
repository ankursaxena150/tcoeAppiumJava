package DDDD;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services to support parameterization.
 */
@IID("{118EEC21-E08B-4E25-AA04-2BE09714FDF3}")
public interface ISupportParameterValues extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The parameter value factory that manages the parameter values of the current object.
   * </p>
   * <p>
   * Getter method for the COM property "ParameterValueFactory"
   * </p>
   * @return  Returns a value of type DDDD.IParameterValueFactory
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IParameterValueFactory parameterValueFactory();


  // Properties:
}
