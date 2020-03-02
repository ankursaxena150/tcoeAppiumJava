package DDDD;

import com4j.*;

/**
 * Facet (BPT).
 */
@IID("{5376CFDA-F28F-4BE7-AD9E-B7E3A549EE88}")
public interface IFacet extends DDDD.IBaseFieldEx {
  // Methods:
  /**
   * <p>
   * The Manual Steps Factory for this facet.
   * </p>
   * <p>
   * Getter method for the COM property "StepsFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject stepsFactory();


  /**
   * <p>
   * For HP use. The Manual Steps Factory for this facet while indicating if the factory is created directly from component.
   * </p>
   * @param bIsCreatedDirectlyFromComponent Mandatory boolean parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getStepsFactory(
          boolean bIsCreatedDirectlyFromComponent);


  /**
   * <p>
   * The parent Component.
   * </p>
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  // Properties:
}
