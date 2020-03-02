package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * Services for managing manual test parameter values.
 */
@IID("{D4EF341E-EA3B-414D-8587-7C55670C0211}")
public interface IParameterValueFactory extends IBaseFactory {
  // Methods:
  /**
   * <p>
   * For HP internal use only. The number of parameters for each test instance.
   * </p>
   * <p>
   * Getter method for the COM property "TestInstancesParametersSummary"
   * </p>
   * @param testInstaceIDs Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  String testInstancesParametersSummary(
          String testInstaceIDs);


  // Properties:
}
