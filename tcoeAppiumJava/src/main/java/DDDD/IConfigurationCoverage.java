package DDDD;

import com4j.*;

/**
 * A requirement coverage by a test configuration.
 */
@IID("{3CD3479F-6A9C-4428-B63C-FB81C8398823}")
public interface IConfigurationCoverage extends IBaseField {
  // Methods:
  /**
   * <p>
   * The status of the configuration coverage.
   * </p>
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  String status();


  /**
   * <p>
   * The configuration covering the requirement.
   * </p>
   * <p>
   * Getter method for the COM property "Configuration"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject configuration();


  /**
   * <p>
   * The criteria included in the configuration coverage.
   * </p>
   * <p>
   * Getter method for the COM property "CriterionCoverage"
   * </p>
   * @param coverageByCycles Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  IList criterionCoverage(
          IList coverageByCycles);


  // Properties:
}
