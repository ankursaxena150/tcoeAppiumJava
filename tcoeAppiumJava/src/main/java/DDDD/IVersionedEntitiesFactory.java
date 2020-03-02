package DDDD;

import com4j.*;

/**
 * For HP use. Extends a factory by providing services for version control.
 */
@IID("{87B013CA-DE17-495F-B9D5-D8B7901FCB4D}")
public interface IVersionedEntitiesFactory extends Com4jObject {
  // Methods:
  /**
   * <p>
   * For HP use. Returns the specified version of the item. Applies only to the Tests entity.
   * </p>
   * @param itemKey Mandatory java.lang.Object parameter.
   * @param versionNumber Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject viewVersion(
          @MarshalAs(NativeType.VARIANT) Object itemKey,
          int versionNumber);


  /**
   * <p>
   * Returns the number of entities of the type managed by this factory that are checked out by the current user.
   * </p>
   * <p>
   * Getter method for the COM property "CheckedOutEntitiesCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  int checkedOutEntitiesCount();


  /**
   * <p>
   * For HP use. Multiple check-in of entities.
   * </p>
   * @param pList Mandatory DDDD.IList parameter.
   * @param comments Mandatory java.lang.String parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void checkInEntities(
          IList pList,
          String comments);


  /**
   * <p>
   * For HP use. Multiple check out of entities.
   * </p>
   * @param pList Mandatory DDDD.IList parameter.
   * @param comments Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  void checkOutEntities(
          IList pList,
          String comments);


  /**
   * <p>
   * For HP use. Multiple undo check out of entities.
   * </p>
   * @param pList Mandatory DDDD.IList parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  void undoCheckOutEntities(
          IList pList);


  // Properties:
}
