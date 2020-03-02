package DDDD;

import com4j.*;

/**
 * For HP use. 
 */
@IID("{5284C153-D403-4444-9533-EAE2DAD4D8DD}")
public interface IDiagramProvider extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns a diagram factory
   * </p>
   * <p>
   * Getter method for the COM property "DiagramFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(3)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject diagramFactory();


  // Properties:
}
