package DDDD;

import com4j.*;

/**
 * Represents a Version Control System connection.
 */
@IID("{5D2F9000-FB53-42D0-AFEF-A98AA3355B3B}")
public interface IVersionControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Saves the changes to the current object.
   * </p>
   * @param comment Mandatory java.lang.String parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void checkIn(
          String comment);


  /**
   * <p>
   * Checks out the object, enabling editing.
   * </p>
   * @param comment Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void checkOut(
          String comment);


  /**
   * <p>
   * Removes the checked out version of the object.
   * </p>
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void undoCheckout();


  /**
   * <p>
   * For HP use. Returns a list of references to the VersionItem objects of this entity.
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  IList versions();


  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object versions(
          int index);

  /**
   * <p>
   * For HP use. Overrides last version and performs check in without promoting the version number.
   * </p>
   * @param comment Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void checkInAndOverrideLastVersion(
          String comment);


  /**
   * <p>
   * For HP use. Get xml than details for each version in which baselines it participates.
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  String versionsRelationsToBaselines();


  // Properties:
}
