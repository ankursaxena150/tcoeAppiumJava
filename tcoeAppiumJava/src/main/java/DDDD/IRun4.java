package DDDD;

import com4j.*;

/**
 * Represents a test run.
 */
@IID("{228A6D83-1973-41CE-A32B-335E51A42AD6}")
public interface IRun4 extends IRun3 {
  // Methods:
  /**
   * <p>
   * Copies design steps into the test run of an executed test. 
   * </p>
   * @param shouldCreateComponentDesignSteps Optional parameter. Default value is false
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(44)
  void createBptRunSteps(
          @Optional @DefaultValue("-1") boolean shouldCreateComponentDesignSteps);


  // Properties:
}
