package DDDD;

import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

/**
 * IFieldProperty5 Interface.
 */
@IID("{0141AC60-238C-488C-9472-4F0606749C31}")
public interface IFieldProperty5 extends IFieldProperty4 {
  // Methods:
  /**
   * <p>
   * The field's referenced table name.
   * </p>
   * <p>
   * Getter method for the COM property "ReferencedTable"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(40)
  String referencedTable();


  /**
   * <p>
   * The name of the id column in the field's referenced table.
   * </p>
   * <p>
   * Getter method for the COM property "ReferencedIdColumn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(41)
  String referencedIdColumn();


  /**
   * <p>
   * The name of the name column in the field's referenced table.
   * </p>
   * <p>
   * Getter method for the COM property "ReferencedNameColumn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(42)
  String referencedNameColumn();


  // Properties:
}
