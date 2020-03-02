package DDDD;

import com4j.*;

/**
 * Obsolete. Use AuditRecord.
 */
@IID("{E672B813-30DA-4429-97A7-A1616F0B7D2D}")
public interface IHistoryRecord2 extends IHistoryRecord {
  // Methods:
  /**
   * <p>
   * The value before the change.
   * </p>
   * <p>
   * Getter method for the COM property "OldValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  Object oldValue();


  // Properties:
}
