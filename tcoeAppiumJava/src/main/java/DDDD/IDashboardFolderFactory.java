package DDDD;

import com4j.*;

/**
 * For HP use. Services to manage Dashboard folders.
 */
@IID("{B739B750-BFE1-43AF-8DD7-E8E8EFBBED7D}")
public interface IDashboardFolderFactory extends IBaseFactoryEx {
  // Methods:
  /**
   * <p>
   * Returns the page IDs of those children of the specified folders that contain private analysis items.
   * </p>
   * @param pIdsList Mandatory DDDD.IList parameter.
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IList getChildPagesWithPrivateItems(
          IList pIdsList);


  /**
   * <p>
   * Returns a reference to the root of the specified tree.
   * </p>
   * @param isPublic Mandatory boolean parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject getTreeRoot(
          boolean isPublic);


  /**
   * <p>
   * Returns the ID of the specified Dashboard Tree Root.
   * </p>
   * @param isPublic Mandatory boolean parameter.
   * @return  Returns a value of type int
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  int getTreeRootID(
          boolean isPublic);


  /**
   * <p>
   * For HP use. Checks whether the specified Dashboard Tree Root is editable.
   * </p>
   * @param isPublic Mandatory boolean parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  boolean isTreeRootEditable(
          boolean isPublic);


  // Properties:
}
