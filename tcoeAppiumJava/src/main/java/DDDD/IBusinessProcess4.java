package DDDD;

import com4j.*;

/**
 * Represents a single Business Process Tests.
 */
@IID("{C87B8EC8-9D70-457C-B3E0-0E286A115695}")
public interface IBusinessProcess4 extends IBusinessProcess3 {
  // Methods:
  /**
   * <p>
   * The BPComponentFactory for this Business Process Tests.
   * </p>
   * <p>
   * Getter method for the COM property "BPComponentFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(78)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject bpComponentFactory();


  /**
   * <p>
   * The BPOutputParamFactory for this Business Process Tests.
   * </p>
   * <p>
   * Getter method for the COM property "BPOutputParamFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject bpOutputParamFactory();


  /**
   * <p>
   * The Last Update Timestamp for this Business Process Tests. according to specified componentFieldName
   * </p>
   * @param componentFieldName Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(80)
  String getLastTimestamp(
          String componentFieldName);


  /**
   * <p>
   * For HP use. Checks if all the components in the test support QTP automation.Returns false if there are no components in the test.
   * </p>
   * <p>
   * Getter method for the COM property "AreAllComponentsInTestSupportQTPAutomation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(81)
  boolean areAllComponentsInTestSupportQTPAutomation();


  /**
   * <p>
   * Get A String containing faulty parts of the business process
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(82)
  String validateBusinessProcess();


  /**
   * <p>
   * For HP use. For each test parameter get a list of bp iter param ids promoted to it
   * </p>
   * @param testParamIdsList Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(83)
  IList getBPIterParamsUsingTestParameters(
          IList testParamIdsList);


  // Properties:
}
