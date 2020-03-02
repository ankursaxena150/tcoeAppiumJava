package DDDD;

import com4j.*;

/**
 * Represents an entity that can have versions.
 */
@IID("{5F63414F-E5F4-44D6-A0D0-42D704BC6E92}")
public interface IVersionedEntity extends Com4jObject {
  // Methods:
  /**
   * <p>
   * For HP use. The version number of the entity.
   * </p>
   * <p>
   * Getter method for the COM property "VersionNumber"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int versionNumber();


  /**
   * <p>
   * For HP use. Checks whether editing is blocked for the entity.
   * </p>
   * <p>
   * Getter method for the COM property "IsViewOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isViewOnly();


  /**
   * <p>
   * The version control object for the entity.
   * </p>
   * <p>
   * Getter method for the COM property "VC"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject vc();


  /**
   * <p>
   * The IVersionData of the entity.
   * </p>
   * <p>
   * Getter method for the COM property "VersionData"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject versionData();


  // Properties:
}
