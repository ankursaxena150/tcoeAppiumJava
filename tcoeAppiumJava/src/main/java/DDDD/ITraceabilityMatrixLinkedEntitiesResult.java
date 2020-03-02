package DDDD;

import com4j.*;

/**
 * For HP use. Represents traceability matrix linked entities of a single entity, for some relation.
 */
@IID("{F523854A-1C20-4A3C-B924-0B85316D8B18}")
public interface ITraceabilityMatrixLinkedEntitiesResult extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns a copy of the name of the relation name.
   * </p>
   * <p>
   * Getter method for the COM property "RelationName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  String relationName();


  /**
   * <p>
   * Returns a copy of the name of the entities' table.
   * </p>
   * <p>
   * Getter method for the COM property "TableName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  String tableName();


  /**
   * <p>
   * The linked entities.
   * </p>
   * <p>
   * Getter method for the COM property "LinkedEntities"
   * </p>
   * @return  Returns a value of type DDDD.IList
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  IList linkedEntities();


  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT,defaultPropertyThrough={IList.class})
  Object linkedEntities(
          int index);

  // Properties:
}
