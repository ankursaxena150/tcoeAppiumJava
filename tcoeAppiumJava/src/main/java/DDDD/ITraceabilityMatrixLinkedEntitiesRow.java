package DDDD;

import com4j.*;

/**
 * For HP use. Represents traceability matrix row for linked entities of a single entity.
 */
@IID("{B71F1446-BDF1-4E63-9C7B-3C95E131B605}")
public interface ITraceabilityMatrixLinkedEntitiesRow extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The ID of the entity of which the row is related to.
   * </p>
   * <p>
   * Getter method for the COM property "EntityID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  int entityID();


  /**
   * <p>
   * Returns a copy of The list of the traceability matrix linked entities results, related to the row.
   * </p>
   * <p>
   * Getter method for the COM property "Results"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  IList results();


  @VTID(8)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object results(
          int index);

  // Properties:
}
