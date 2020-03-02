package DDDD;

import com4j.*;

/**
 * Services for managing relations between Quality Center entities.
 */
@IID("{10530C88-4197-428D-B4FB-4A39D2CCE526}")
public interface ISupportAssetRelations extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The asset's AssetRelationsFactory object.
   * </p>
   * <p>
   * Getter method for the COM property "AssetRelationFactory"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject assetRelationFactory();


  /**
   * <p>
   * Downloads an asset and its related assets.
   * </p>
   * @param condition Mandatory java.lang.String parameter.
   * @param filterMask Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String download(
          String condition,
          int filterMask);


  /**
   * <p>
   * Returns the list of relations to assets used by this asset or by user assets owned by this asset.
   * </p>
   * <p>
   * Getter method for the COM property "Using"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  IList using();


  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object using(
          int index);

  /**
   * <p>
   * Returns the list of relations to assets that are using this asset or that are using user assets owned by this asset.
   * </p>
   * <p>
   * Getter method for the COM property "UsedBy"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  IList usedBy();


  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object usedBy(
          int index);

  // Properties:
}
