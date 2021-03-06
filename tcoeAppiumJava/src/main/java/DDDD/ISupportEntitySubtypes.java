package DDDD;

import com4j.*;

/**
 * Represents a factory with support for subtypes.
 */
@IID("{0B688151-E04D-438A-98B6-82A33138A26E}")
public interface ISupportEntitySubtypes extends Com4jObject {
  // Methods:
  /**
   * <p>
   * List of subtypes supported by this entity.
   * </p>
   * <p>
   * Getter method for the COM property "Subtypes"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  IList subtypes();


  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object subtypes(
          int index);

  /**
   * <p>
   * Subtype corresponding to the given subtype ID.
   * </p>
   * @param subtypeId Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getSubtype(
          String subtypeId);


  // Properties:
}
